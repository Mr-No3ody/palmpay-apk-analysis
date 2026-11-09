package androidx.emoji2.text;

import android.content.Context;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n implements EmojiProcessor$EmojiProcessCallback, MetadataListReader$OpenTypeReader, EmojiCompat$MetadataRepoLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16906a;

    public n(Context context) {
        this.f16906a = context.getApplicationContext();
    }

    @Override // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public long getPosition() {
        return ((ByteBuffer) this.f16906a).position();
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public Object getResult() {
        return this;
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public boolean handleEmoji(CharSequence charSequence, int i7, int i10, w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i7, i10), (String) this.f16906a)) {
            return true;
        }
        wVar.f16941c = (wVar.f16941c & 3) | 4;
        return false;
    }

    @Override // androidx.emoji2.text.EmojiCompat$MetadataRepoLoader
    public void load(h hVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new j(this, 0, hVar, threadPoolExecutor));
    }

    @Override // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public int readTag() {
        return ((ByteBuffer) this.f16906a).getInt();
    }

    @Override // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public long readUnsignedInt() {
        return ((long) ((ByteBuffer) this.f16906a).getInt()) & 4294967295L;
    }

    @Override // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public int readUnsignedShort() {
        return ((ByteBuffer) this.f16906a).getShort() & 65535;
    }

    @Override // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public void skip(int i7) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f16906a;
        byteBuffer.position(byteBuffer.position() + i7);
    }

    public n(ByteBuffer byteBuffer) {
        this.f16906a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public n(String str) {
        this.f16906a = str;
    }
}
