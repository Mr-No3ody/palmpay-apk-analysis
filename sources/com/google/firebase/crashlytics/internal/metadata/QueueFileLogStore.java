package com.google.firebase.crashlytics.internal.metadata;

import com.adjust.sdk.Constants;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.maps.android.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class QueueFileLogStore implements FileLogStore {
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    public static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i7) {
            this.bytes = bArr;
            this.offset = i7;
        }
    }

    public QueueFileLogStore(File file, int i7) {
        this.workingFile = file;
        this.maxLogSize = i7;
    }

    private void doWriteToLog(long j6, String str) {
        if (this.logFile == null) {
            return;
        }
        if (str == null) {
            str = BuildConfig.TRAVIS;
        }
        try {
            int i7 = this.maxLogSize / 4;
            if (str.length() > i7) {
                str = "..." + str.substring(str.length() - i7);
            }
            this.logFile.add(String.format(Locale.US, "%d %s%n", Long.valueOf(j6), str.replaceAll("\r", " ").replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, " ")).getBytes(UTF_8));
            while (!this.logFile.isEmpty() && this.logFile.usedBytes() > this.maxLogSize) {
                this.logFile.remove();
            }
        } catch (IOException e10) {
            Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        QueueFile queueFile = this.logFile;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.usedBytes()];
        try {
            this.logFile.forEach(new QueueFile.ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.1
                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i7) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i7);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i7;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e10) {
            Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new QueueFile(this.workingFile);
            } catch (IOException e10) {
                Logger.getLogger().e("Could not open log file: " + this.workingFile, e10);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void closeLogFile() {
        CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        int i7 = logBytes.offset;
        byte[] bArr = new byte[i7];
        System.arraycopy(logBytes.bytes, 0, bArr, 0, i7);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new String(logAsBytes, UTF_8);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void writeToLog(long j6, String str) {
        openLogFile();
        doWriteToLog(j6, str);
    }
}
