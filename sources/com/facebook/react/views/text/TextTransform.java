package com.facebook.react.views.text;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/views/text/TextTransform;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "UPPERCASE", "LOWERCASE", "CAPITALIZE", "UNSET", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum TextTransform {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    private static final /* synthetic */ EnumEntries $ENTRIES = b.n(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/text/TextTransform$Companion;", "", "<init>", "()V", "apply", "", ReactTextInputShadowNode.PROP_TEXT, ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "Lcom/facebook/react/views/text/TextTransform;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String apply(@NotNull String text, @Nullable TextTransform textTransform) {
            Intrinsics.checkNotNullParameter(text, "text");
            return TextTransformKt.applyTextTransform(text, textTransform);
        }

        private Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final String apply(@NotNull String str, @Nullable TextTransform textTransform) {
        return INSTANCE.apply(str, textTransform);
    }

    @NotNull
    public static EnumEntries<TextTransform> getEntries() {
        return $ENTRIES;
    }
}
