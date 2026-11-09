package kotlinx.serialization.json.internal;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@JsonFriendModuleApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter;", "", "", "value", "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", ReactTextInputShadowNode.PROP_TEXT, "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InternalJsonWriter {
    void release();

    void write(@NotNull String text);

    void writeChar(char c6);

    void writeLong(long value);

    void writeQuoted(@NotNull String text);
}
