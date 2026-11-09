package com.palmpay.lib.bridge.entry;

import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/palmpay/lib/bridge/entry/BridgeResult;", "T", "", "", "code", "", "msg", "entry", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Object;", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/palmpay/lib/bridge/entry/BridgeResult;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "setCode", "(I)V", "Ljava/lang/String;", "getMsg", "setMsg", "(Ljava/lang/String;)V", "Ljava/lang/Object;", "getEntry", "setEntry", "(Ljava/lang/Object;)V", "Companion", "a", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BridgeResult<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int code;

    @Nullable
    private T entry;

    @Nullable
    private String msg;

    /* JADX INFO: renamed from: com.palmpay.lib.bridge.entry.BridgeResult$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BridgeResult cancelResult$default(Companion companion, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            return companion.cancelResult(str);
        }

        public static /* synthetic */ BridgeResult illegalArgumentResult$default(Companion companion, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            return companion.illegalArgumentResult(str);
        }

        public static /* synthetic */ BridgeResult notSupportResult$default(Companion companion, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            return companion.notSupportResult(str);
        }

        public static /* synthetic */ BridgeResult rejectResult$default(Companion companion, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            return companion.rejectResult(str);
        }

        public static /* synthetic */ BridgeResult successResult$default(Companion companion, Object obj, String str, int i7, Object obj2) {
            if ((i7 & 2) != 0) {
                str = null;
            }
            return companion.successResult(obj, str);
        }

        @NotNull
        public final BridgeResult<Object> cancelResult(@Nullable String str) {
            if (str == null) {
                str = PPRNBridge.DIALOG_ACTION_CANCEL;
            }
            return new BridgeResult<>(-1, str, null, 4, null);
        }

        @NotNull
        public final BridgeResult<Object> failResult(@Nullable String str) {
            if (str == null) {
                str = "fail";
            }
            return new BridgeResult<>(1, str, null, 4, null);
        }

        @NotNull
        public final BridgeResult<Object> illegalArgumentResult(@Nullable String str) {
            if (str == null) {
                str = "params not correct";
            }
            return new BridgeResult<>(4, str, null, 4, null);
        }

        @NotNull
        public final BridgeResult<Object> notSupportResult(@Nullable String str) {
            if (str == null) {
                str = "not support";
            }
            return new BridgeResult<>(2, str, null, 4, null);
        }

        @NotNull
        public final BridgeResult<Object> rejectResult(@Nullable String str) {
            if (str == null) {
                str = "reject";
            }
            return new BridgeResult<>(3, str, null, 4, null);
        }

        @NotNull
        public final <T> BridgeResult<T> successResult(@Nullable T t, @Nullable String str) {
            if (str == null) {
                str = "success";
            }
            return new BridgeResult<>(0, str, t);
        }

        private Companion() {
        }
    }

    public BridgeResult(int i7, @Nullable String str, @Nullable T t) {
        this.code = i7;
        this.msg = str;
        this.entry = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BridgeResult copy$default(BridgeResult bridgeResult, int i7, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            i7 = bridgeResult.code;
        }
        if ((i10 & 2) != 0) {
            str = bridgeResult.msg;
        }
        if ((i10 & 4) != 0) {
            obj = bridgeResult.entry;
        }
        return bridgeResult.copy(i7, str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final T component3() {
        return this.entry;
    }

    @NotNull
    public final BridgeResult<T> copy(int code, @Nullable String msg, @Nullable T entry) {
        return new BridgeResult<>(code, msg, entry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BridgeResult)) {
            return false;
        }
        BridgeResult bridgeResult = (BridgeResult) other;
        return this.code == bridgeResult.code && Intrinsics.c(this.msg, bridgeResult.msg) && Intrinsics.c(this.entry, bridgeResult.entry);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getEntry() {
        return this.entry;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.msg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.entry;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public final void setCode(int i7) {
        this.code = i7;
    }

    public final void setEntry(@Nullable T t) {
        this.entry = t;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    @NotNull
    public String toString() {
        return "BridgeResult(code=" + this.code + ", msg=" + this.msg + ", entry=" + this.entry + ')';
    }

    public /* synthetic */ BridgeResult(int i7, String str, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, (i10 & 4) != 0 ? null : obj);
    }
}
