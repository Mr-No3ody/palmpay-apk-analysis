package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputKeyPressEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "key", "", "<init>", "(IILjava/lang/String;)V", "(ILjava/lang/String;)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "canCoalesce", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactTextInputKeyPressEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactTextInputKeyPressEvent.kt\ncom/facebook/react/views/textinput/ReactTextInputKeyPressEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class ReactTextInputKeyPressEvent extends Event<ReactTextInputKeyPressEvent> {

    @NotNull
    public static final String EVENT_NAME = "topKeyPress";

    @NotNull
    private final String key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactTextInputKeyPressEvent(int i7, int i10, @NotNull String key) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("key", this.key);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use the constructor with surfaceId instead", replaceWith = @ReplaceWith(expression = "ReactTextInputKeyPressEvent(surfaceId, viewId, key)", imports = {}))
    public ReactTextInputKeyPressEvent(int i7, @NotNull String key) {
        this(-1, i7, key);
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
