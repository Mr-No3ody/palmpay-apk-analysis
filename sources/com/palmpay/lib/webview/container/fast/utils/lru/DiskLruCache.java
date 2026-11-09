package com.palmpay.lib.webview.container.fast.utils.lru;

import N8.q0;
import androidx.camera.camera2.internal.F;
import com.alibaba.android.arouter.utils.Consts;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class DiskLruCache implements Closeable {
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final File directory;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private Writer journalWriter;
    private long maxSize;
    private int redundantOpCount;
    private final int valueCount;
    static final String STRING_KEY_PATTERN = "[a-z0-9_-]{1,120}";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile(STRING_KEY_PATTERN);
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.palmpay.lib.webview.container.fast.utils.lru.DiskLruCache.2
        @Override // java.io.OutputStream
        public void write(int i7) throws IOException {
        }
    };
    private long size = 0;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long nextSequenceNumber = 0;
    final ThreadPoolExecutor executorService = new ShadowThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), "\u200bcom.palmpay.lib.webview.container.fast.utils.lru.DiskLruCache", true);
    private final Callable<Void> cleanupCallable = new Callable<Void>() { // from class: com.palmpay.lib.webview.container.fast.utils.lru.DiskLruCache.1
        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (DiskLruCache.this) {
                try {
                    if (DiskLruCache.this.journalWriter == null) {
                        return null;
                    }
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public final class Editor {
        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        private final boolean[] written;

        public class FaultHidingOutputStream extends FilterOutputStream {
            public /* synthetic */ FaultHidingOutputStream(Editor editor, FileOutputStream fileOutputStream) {
                this((OutputStream) fileOutputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i7) {
                try {
                    ((FilterOutputStream) this).out.write(i7);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i7, int i10) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i7, i10);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }
        }

        public /* synthetic */ Editor(DiskLruCache diskLruCache, Entry entry, int i7) {
            this(entry);
        }

        public void abort() throws IOException {
            DiskLruCache.this.completeEdit(this, false);
        }

        public void abortUnlessCommitted() {
            if (this.committed) {
                return;
            }
            try {
                abort();
            } catch (IOException unused) {
            }
        }

        public void commit() throws IOException {
            if (this.hasErrors) {
                DiskLruCache.this.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                DiskLruCache.this.completeEdit(this, true);
            }
            this.committed = true;
        }

        public String getString(int i7) throws IOException {
            InputStream inputStreamNewInputStream = newInputStream(i7);
            if (inputStreamNewInputStream != null) {
                return DiskLruCache.inputStreamToString(inputStreamNewInputStream);
            }
            return null;
        }

        public InputStream newInputStream(int i7) throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!this.entry.readable) {
                    return null;
                }
                try {
                    return new FileInputStream(this.entry.getCleanFile(i7));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public OutputStream newOutputStream(int i7) throws IOException {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            if (i7 < 0 || i7 >= DiskLruCache.this.valueCount) {
                StringBuilder sbE = F.e(i7, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
                sbE.append(DiskLruCache.this.valueCount);
                throw new IllegalArgumentException(sbE.toString());
            }
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.entry.readable) {
                        this.written[i7] = true;
                    }
                    File dirtyFile = this.entry.getDirtyFile(i7);
                    try {
                        fileOutputStream = new FileOutputStream(dirtyFile);
                    } catch (FileNotFoundException unused) {
                        DiskLruCache.this.directory.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(dirtyFile);
                        } catch (FileNotFoundException unused2) {
                            return DiskLruCache.NULL_OUTPUT_STREAM;
                        }
                    }
                    faultHidingOutputStream = new FaultHidingOutputStream(this, fileOutputStream);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return faultHidingOutputStream;
        }

        public void set(int i7, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i7), Util.UTF_8);
                try {
                    outputStreamWriter2.write(str);
                    Util.closeQuietly(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    Util.closeQuietly(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private Editor(Entry entry) {
            this.entry = entry;
            this.written = entry.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }
    }

    public final class Entry {
        private Editor currentEditor;
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;

        public /* synthetic */ Entry(DiskLruCache diskLruCache, String str, int i7) {
            this(str);
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length != DiskLruCache.this.valueCount) {
                throw invalidLengths(strArr);
            }
            for (int i7 = 0; i7 < strArr.length; i7++) {
                try {
                    this.lengths[i7] = Long.parseLong(strArr[i7]);
                } catch (NumberFormatException unused) {
                    throw invalidLengths(strArr);
                }
            }
        }

        public File getCleanFile(int i7) {
            return new File(DiskLruCache.this.directory, this.key + Consts.DOT + i7);
        }

        public File getDirtyFile(int i7) {
            return new File(DiskLruCache.this.directory, this.key + Consts.DOT + i7 + ".tmp");
        }

        public String getLengths() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j6 : this.lengths) {
                sb2.append(' ');
                sb2.append(j6);
            }
            return sb2.toString();
        }

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }
    }

    public final class Snapshot implements Closeable {
        private final InputStream[] ins;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        public /* synthetic */ Snapshot(DiskLruCache diskLruCache, String str, long j6, InputStream[] inputStreamArr, long[] jArr, int i7) {
            this(str, j6, inputStreamArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.ins) {
                Util.closeQuietly(inputStream);
            }
        }

        public Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public InputStream getInputStream(int i7) {
            return this.ins[i7];
        }

        public long getLength(int i7) {
            return this.lengths[i7];
        }

        public String getString(int i7) throws IOException {
            return DiskLruCache.inputStreamToString(getInputStream(i7));
        }

        private Snapshot(String str, long j6, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j6;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }
    }

    private DiskLruCache(File file, int i7, int i10, long j6) {
        this.directory = file;
        this.appVersion = i7;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = i10;
        this.maxSize = j6;
    }

    private void checkNotClosed() {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void completeEdit(Editor editor, boolean z3) throws IOException {
        Entry entry = editor.entry;
        if (entry.currentEditor != editor) {
            throw new IllegalStateException();
        }
        if (z3 && !entry.readable) {
            for (int i7 = 0; i7 < this.valueCount; i7++) {
                if (!editor.written[i7]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i7);
                }
                if (!entry.getDirtyFile(i7).exists()) {
                    editor.abort();
                    return;
                }
            }
        }
        for (int i10 = 0; i10 < this.valueCount; i10++) {
            File dirtyFile = entry.getDirtyFile(i10);
            if (!z3) {
                deleteIfExists(dirtyFile);
            } else if (dirtyFile.exists()) {
                File cleanFile = entry.getCleanFile(i10);
                dirtyFile.renameTo(cleanFile);
                long j6 = entry.lengths[i10];
                long length = cleanFile.length();
                entry.lengths[i10] = length;
                this.size = (this.size - j6) + length;
            }
        }
        this.redundantOpCount++;
        entry.currentEditor = null;
        if (entry.readable || z3) {
            entry.readable = true;
            this.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
            if (z3) {
                long j10 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j10;
                entry.sequenceNumber = j10;
            }
        } else {
            this.lruEntries.remove(entry.key);
            this.journalWriter.write("REMOVE " + entry.key + '\n');
        }
        this.journalWriter.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
    }

    private static void deleteIfExists(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inputStreamToString(InputStream inputStream) throws IOException {
        return Util.readFully(new InputStreamReader(inputStream, Util.UTF_8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean journalRebuildRequired() {
        int i7 = this.redundantOpCount;
        return i7 >= 2000 && i7 >= this.lruEntries.size();
    }

    public static DiskLruCache open(File file, int i7, int i10, long j6) throws IOException {
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                renameTo(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, i7, i10, j6);
        if (diskLruCache.journalFile.exists()) {
            try {
                diskLruCache.readJournal();
                diskLruCache.processJournal();
                return diskLruCache;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                diskLruCache.delete();
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, i7, i10, j6);
        diskLruCache2.rebuildJournal();
        return diskLruCache2;
    }

    private void processJournal() throws IOException {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i7 = 0;
            if (next.currentEditor == null) {
                while (i7 < this.valueCount) {
                    this.size += next.lengths[i7];
                    i7++;
                }
            } else {
                next.currentEditor = null;
                while (i7 < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i7));
                    deleteIfExists(next.getDirtyFile(i7));
                    i7++;
                }
                it.remove();
            }
        }
    }

    private void readJournal() throws IOException {
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.US_ASCII);
        try {
            String line = strictLineReader.readLine();
            String line2 = strictLineReader.readLine();
            String line3 = strictLineReader.readLine();
            String line4 = strictLineReader.readLine();
            String line5 = strictLineReader.readLine();
            if (!MAGIC.equals(line) || !"1".equals(line2) || !Integer.toString(this.appVersion).equals(line3) || !Integer.toString(this.valueCount).equals(line4) || !"".equals(line5)) {
                throw new IOException("unexpected journal header: [" + line + ", " + line2 + ", " + line4 + ", " + line5 + "]");
            }
            int i7 = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i7++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i7 - this.lruEntries.size();
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
                    }
                    Util.closeQuietly(strictLineReader);
                    return;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(strictLineReader);
            throw th;
        }
    }

    private void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i7 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i7);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i7);
            if (iIndexOf == 6 && str.startsWith(REMOVE)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i7, iIndexOf2);
        }
        Entry entry = this.lruEntries.get(strSubstring);
        int i10 = 0;
        if (entry == null) {
            entry = new Entry(this, strSubstring, i10);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(CLEAN)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            entry.readable = true;
            entry.currentEditor = null;
            entry.setLengths(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(DIRTY)) {
            entry.currentEditor = new Editor(this, entry, i10);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(READ)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void rebuildJournal() throws IOException {
        try {
            Writer writer = this.journalWriter;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), Util.US_ASCII));
            try {
                bufferedWriter.write(MAGIC);
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write("1");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.appVersion));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.valueCount));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.currentEditor != null) {
                        bufferedWriter.write("DIRTY " + entry.key + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.journalFile.exists()) {
                    renameTo(this.journalFile, this.journalFileBackup, true);
                }
                renameTo(this.journalFileTmp, this.journalFile, false);
                this.journalFileBackup.delete();
                this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void renameTo(File file, File file2, boolean z3) throws IOException {
        if (z3) {
            deleteIfExists(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            remove(this.lruEntries.entrySet().iterator().next().getKey());
        }
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            throw new IllegalArgumentException(q0.k("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.journalWriter == null) {
                return;
            }
            for (Entry entry : new ArrayList(this.lruEntries.values())) {
                if (entry.currentEditor != null) {
                    entry.currentEditor.abort();
                }
            }
            trimToSize();
            this.journalWriter.close();
            this.journalWriter = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void delete() throws IOException {
        close();
        Util.deleteContents(this.directory);
    }

    public Editor edit(String str) throws IOException {
        return edit(str, -1L);
    }

    public synchronized void flush() throws IOException {
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    public synchronized Snapshot get(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        try {
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return null;
            }
            if (!entry.readable) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.valueCount];
            for (int i7 = 0; i7 < this.valueCount; i7++) {
                try {
                    try {
                        try {
                            inputStreamArr[i7] = new FileInputStream(entry.getCleanFile(i7));
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i10 = 0; i10 < this.valueCount && (inputStream = inputStreamArr[i10]) != null; i10++) {
                            Util.closeQuietly(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("READ " + str + '\n'));
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return new Snapshot(this, str, entry.sequenceNumber, inputStreamArr, entry.lengths, 0);
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public File getDirectory() {
        return this.directory;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized boolean isClosed() {
        return this.journalWriter == null;
    }

    public synchronized boolean remove(String str) throws IOException {
        try {
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry != null && entry.currentEditor == null) {
                for (int i7 = 0; i7 < this.valueCount; i7++) {
                    File cleanFile = entry.getCleanFile(i7);
                    if (cleanFile.exists() && !cleanFile.delete()) {
                        throw new IOException("failed to delete " + cleanFile);
                    }
                    this.size -= entry.lengths[i7];
                    entry.lengths[i7] = 0;
                }
                this.redundantOpCount++;
                this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
                this.lruEntries.remove(str);
                if (journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setMaxSize(long j6) {
        this.maxSize = j6;
        this.executorService.submit(this.cleanupCallable);
    }

    public synchronized long size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Editor edit(String str, long j6) throws IOException {
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j6 != -1 && (entry == null || entry.sequenceNumber != j6)) {
            return null;
        }
        int i7 = 0;
        if (entry == null) {
            entry = new Entry(this, str, i7);
            this.lruEntries.put(str, entry);
        } else if (entry.currentEditor != null) {
            return null;
        }
        Editor editor = new Editor(this, entry, i7);
        entry.currentEditor = editor;
        this.journalWriter.write("DIRTY " + str + '\n');
        this.journalWriter.flush();
        return editor;
    }
}
