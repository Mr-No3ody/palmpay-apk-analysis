package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f16887j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile i f16888k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f16889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M.g f16890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f16891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f16892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f16893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EmojiCompat$MetadataRepoLoader f16894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final retrofit2.adapter.rxjava2.d f16895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f16897i;

    public i(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f16889a = reentrantReadWriteLock;
        this.f16891c = 3;
        EmojiCompat$MetadataRepoLoader emojiCompat$MetadataRepoLoader = sVar.f16929a;
        this.f16894f = emojiCompat$MetadataRepoLoader;
        int i7 = sVar.f16930b;
        this.f16896h = i7;
        this.f16897i = sVar.f16931c;
        this.f16892d = new Handler(Looper.getMainLooper());
        this.f16890b = new M.g(0);
        this.f16895g = new retrofit2.adapter.rxjava2.d(3);
        f fVar = new f(this);
        this.f16893e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f16891c = 0;
            } catch (Throwable th) {
                this.f16889a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                emojiCompat$MetadataRepoLoader.load(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (f16887j) {
            iVar = f16888k;
            p118hf.a.k(iVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return iVar;
    }

    public static void c(s sVar) {
        if (f16888k == null) {
            synchronized (f16887j) {
                try {
                    if (f16888k == null) {
                        f16888k = new i(sVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean d() {
        return f16888k != null;
    }

    public final int b() {
        this.f16889a.readLock().lock();
        try {
            return this.f16891c;
        } finally {
            this.f16889a.readLock().unlock();
        }
    }

    public final void e() {
        p118hf.a.k(this.f16896h == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (b() == 1) {
            return;
        }
        this.f16889a.writeLock().lock();
        try {
            if (this.f16891c == 0) {
                this.f16889a.writeLock().unlock();
                return;
            }
            this.f16891c = 0;
            this.f16889a.writeLock().unlock();
            f fVar = this.f16893e;
            i iVar = fVar.f16884a;
            try {
                iVar.f16894f.load(new e(fVar));
            } catch (Throwable th) {
                iVar.f(th);
            }
        } catch (Throwable th2) {
            this.f16889a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f16889a.writeLock().lock();
        try {
            this.f16891c = 2;
            arrayList.addAll(this.f16890b);
            this.f16890b.clear();
            this.f16889a.writeLock().unlock();
            this.f16892d.post(new androidx.core.provider.a(arrayList, this.f16891c, th));
        } catch (Throwable th2) {
            this.f16889a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:32:0x005f, B:35:0x0064, B:37:0x0068, B:39:0x0075, B:46:0x0094, B:48:0x009e, B:50:0x00a1, B:52:0x00a4, B:54:0x00b4, B:55:0x00b7), top: B:89:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:32:0x005f, B:35:0x0064, B:37:0x0068, B:39:0x0075, B:46:0x0094, B:48:0x009e, B:50:0x00a1, B:52:0x00a4, B:54:0x00b4, B:55:0x00b7), top: B:89:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public final CharSequence g(CharSequence charSequence, int i7, int i10) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i11;
        int i12;
        q[] qVarArr;
        int spanStart;
        p118hf.a.k(b() == 1, "Not initialized yet");
        if (i7 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        p118hf.a.g(i7 <= i10, "start should be <= than end");
        z zVar = null;
        if (charSequence == null) {
            return null;
        }
        p118hf.a.g(i7 <= charSequence.length(), "start should be < than charSequence length");
        p118hf.a.g(i10 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i7 == i10) {
            return charSequence;
        }
        p pVar = this.f16893e.f16885b;
        pVar.getClass();
        boolean z3 = charSequence instanceof v;
        if (z3) {
            ((v) charSequence).a();
        }
        if (z3) {
            zVar = new z((Spannable) charSequence);
            if (zVar != null) {
                for (q qVar : qVarArr) {
                    spanStart = zVar.f16944b.getSpanStart(qVar);
                    int spanEnd = zVar.f16944b.getSpanEnd(qVar);
                    if (spanStart != i10) {
                        zVar.removeSpan(qVar);
                    }
                    i7 = Math.min(spanStart, i7);
                    i10 = Math.max(spanEnd, i10);
                }
            }
            i11 = i7;
            i12 = i10;
            if (i11 != i12) {
                charSequence2 = charSequence;
                if (!z3) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z3) {
                    return charSequence2;
                }
            }
            ((v) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    zVar = new z((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z3) {
                        throw th;
                    }
                    ((v) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i7 - 1, i10 + 1, q.class) <= i10) {
                zVar = new z();
                zVar.f16943a = false;
                zVar.f16944b = new SpannableString(charSequence);
            }
            if (zVar != null && (qVarArr = (q[]) zVar.f16944b.getSpans(i7, i10, q.class)) != null && qVarArr.length > 0) {
                while (i < r5) {
                    spanStart = zVar.f16944b.getSpanStart(qVar);
                    int spanEnd2 = zVar.f16944b.getSpanEnd(qVar);
                    if (spanStart != i10) {
                        zVar.removeSpan(qVar);
                    }
                    i7 = Math.min(spanStart, i7);
                    i10 = Math.max(spanEnd2, i10);
                }
            }
            i11 = i7;
            i12 = i10;
            if (i11 != i12 || i11 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z3) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    z zVar2 = (z) pVar.c(charSequence2, i11, i12, Integer.MAX_VALUE, false, new m(zVar, pVar.f16913a));
                    if (zVar2 != null) {
                        Spannable spannable = zVar2.f16944b;
                        if (z3) {
                            ((v) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z3) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z3) {
                        throw th;
                    }
                    ((v) charSequence2).b();
                    throw th;
                }
            }
            ((v) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z3) {
            throw th;
        }
        ((v) charSequence2).b();
        throw th;
    }

    public final void h(g gVar) {
        p118hf.a.j(gVar, "initCallback cannot be null");
        this.f16889a.writeLock().lock();
        try {
            if (this.f16891c == 1 || this.f16891c == 2) {
                this.f16892d.post(new androidx.core.provider.a(Arrays.asList(gVar), this.f16891c, (Throwable) null));
            } else {
                this.f16890b.add(gVar);
            }
        } finally {
            this.f16889a.writeLock().unlock();
        }
    }
}
