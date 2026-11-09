package com.facebook.react.fabric.mounting.mountitems;

import D3.a;
import E.AbstractC0198c;
import android.os.Trace;
import androidx.camera.video.u;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.StateWrapper;
import com.google.maps.android.BuildConfig;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p381za.c;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/BatchMountItem;", "surfaceId", "", "intBuffer", "", "objBuffer", "", "", "commitNumber", "<init>", "(I[I[Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "intBufferLen", "objBufferLen", "beginMarkers", "", "reason", "", "endMarkers", "execute", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "getSurfaceId", "isBatchEmpty", "", "toString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntBufferBatchMountItem implements BatchMountItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int INSTRUCTION_CREATE = 2;
    public static final int INSTRUCTION_DELETE = 4;
    public static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    public static final int INSTRUCTION_INSERT = 8;
    public static final int INSTRUCTION_REMOVE = 16;
    public static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    public static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    public static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    public static final int INSTRUCTION_UPDATE_PADDING = 512;
    public static final int INSTRUCTION_UPDATE_PROPS = 32;
    public static final int INSTRUCTION_UPDATE_STATE = 64;

    @NotNull
    private static final String TAG;
    private final int commitNumber;

    @NotNull
    private final int[] intBuffer;
    private final int intBufferLen;

    @NotNull
    private final Object[] objBuffer;
    private final int objBufferLen;
    private final int surfaceId;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\tH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "INSTRUCTION_FLAG_MULTIPLE", "", "INSTRUCTION_CREATE", "INSTRUCTION_DELETE", "INSTRUCTION_INSERT", "INSTRUCTION_REMOVE", "INSTRUCTION_UPDATE_PROPS", "INSTRUCTION_UPDATE_STATE", "INSTRUCTION_UPDATE_LAYOUT", "INSTRUCTION_UPDATE_EVENT_EMITTER", "INSTRUCTION_UPDATE_PADDING", "INSTRUCTION_UPDATE_OVERFLOW_INSET", "nameForInstructionString", "type", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String nameForInstructionString(int type) {
            if (type == 2) {
                return "CREATE";
            }
            if (type == 4) {
                return "DELETE";
            }
            if (type == 8) {
                return "INSERT";
            }
            if (type == 16) {
                return "REMOVE";
            }
            if (type == 32) {
                return "UPDATE_PROPS";
            }
            if (type == 64) {
                return "UPDATE_STATE";
            }
            if (type == 128) {
                return "UPDATE_LAYOUT";
            }
            if (type == 256) {
                return "UPDATE_EVENT_EMITTER";
            }
            if (type != 512) {
                return type != 1024 ? c.UNKNOWN_PROCESS_NAME : "UPDATE_OVERFLOW_INSET";
            }
            return "UPDATE_PADDING";
        }

        @NotNull
        public final String getTAG() {
            return IntBufferBatchMountItem.TAG;
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("IntBufferBatchMountItem", "getSimpleName(...)");
        TAG = "IntBufferBatchMountItem";
    }

    public IntBufferBatchMountItem(int i7, @NotNull int[] intBuffer, @NotNull Object[] objBuffer, int i10) {
        Intrinsics.checkNotNullParameter(intBuffer, "intBuffer");
        Intrinsics.checkNotNullParameter(objBuffer, "objBuffer");
        this.surfaceId = i7;
        this.intBuffer = intBuffer;
        this.objBuffer = objBuffer;
        this.commitNumber = i10;
        this.intBufferLen = intBuffer.length;
        this.objBufferLen = objBuffer.length;
    }

    private final void beginMarkers(String reason) {
        a.a("IntBufferBatchMountItem::" + reason);
        int i7 = this.commitNumber;
        if (i7 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i7);
        }
    }

    private final void endMarkers() {
        int i7 = this.commitNumber;
        if (i7 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i7);
        }
        Trace.endSection();
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(@NotNull MountingManager mountingManager) {
        int i7;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.surfaceId);
        if (surfaceManager == null) {
            p229p2.a.j(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.surfaceId));
            return;
        }
        if (surfaceManager.isStopped()) {
            p229p2.a.j(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.surfaceId));
            return;
        }
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            p229p2.a.c(TAG, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.surfaceId));
        }
        beginMarkers("mountViews");
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.intBufferLen) {
            int[] iArr = this.intBuffer;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            int i17 = i16 & (-2);
            if ((i16 & 1) != 0) {
                int i18 = iArr[i15];
                i15 = i13 + 2;
                i7 = i18;
            } else {
                i7 = 1;
            }
            String[] args = {"numInstructions", String.valueOf(i7)};
            String sectionName = "IntBufferBatchMountItem::mountInstructions::" + INSTANCE.nameForInstructionString(i17);
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            Intrinsics.checkNotNullParameter(args, "args");
            StringBuilder sb2 = new StringBuilder();
            String str = args[0];
            String str2 = args[1];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            AbstractC0198c.e(sectionName + "|" + string);
            int i19 = i14;
            for (int i20 = 0; i20 < i7; i20++) {
                if (i17 == 2) {
                    int i21 = i19 + 1;
                    String str3 = (String) this.objBuffer[i19];
                    if (str3 == null) {
                        str3 = "";
                    }
                    String fabricComponentName = FabricNameComponentMapping.getFabricComponentName(str3);
                    int[] iArr2 = this.intBuffer;
                    int i22 = iArr2[i15];
                    Object[] objArr = this.objBuffer;
                    ReadableMap readableMap = (ReadableMap) objArr[i21];
                    int i23 = i19 + 3;
                    StateWrapper stateWrapper = (StateWrapper) objArr[i19 + 2];
                    i19 += 4;
                    EventEmitterWrapper eventEmitterWrapper = (EventEmitterWrapper) objArr[i23];
                    int i24 = i15 + 2;
                    surfaceManager.createView(fabricComponentName, i22, readableMap, stateWrapper, eventEmitterWrapper, iArr2[i15 + 1] == 1);
                    i15 = i24;
                } else if (i17 == 4) {
                    surfaceManager.deleteView(this.intBuffer[i15]);
                    i15++;
                } else if (i17 == 8) {
                    int[] iArr3 = this.intBuffer;
                    int i25 = iArr3[i15];
                    int i26 = i15 + 2;
                    int i27 = iArr3[i15 + 1];
                    i15 += 3;
                    surfaceManager.addViewAt(i27, i25, iArr3[i26]);
                } else if (i17 != 16) {
                    if (i17 == 32) {
                        i10 = i15 + 1;
                        i11 = i19 + 1;
                        surfaceManager.updateProps(this.intBuffer[i15], (ReadableMap) this.objBuffer[i19]);
                    } else if (i17 == 64) {
                        i10 = i15 + 1;
                        i11 = i19 + 1;
                        surfaceManager.updateState(this.intBuffer[i15], (StateWrapper) this.objBuffer[i19]);
                    } else if (i17 == 128) {
                        int[] iArr4 = this.intBuffer;
                        surfaceManager.updateLayout(iArr4[i15], iArr4[i15 + 1], iArr4[i15 + 2], iArr4[i15 + 3], iArr4[i15 + 4], iArr4[i15 + 5], iArr4[i15 + 6], iArr4[i15 + 7]);
                        i15 += 8;
                    } else if (i17 != 256) {
                        if (i17 == 512) {
                            int[] iArr5 = this.intBuffer;
                            i12 = i15 + 5;
                            surfaceManager.updatePadding(iArr5[i15], iArr5[i15 + 1], iArr5[i15 + 2], iArr5[i15 + 3], iArr5[i15 + 4]);
                        } else {
                            if (i17 != 1024) {
                                throw new IllegalArgumentException(u.h(i17, "Invalid type argument to IntBufferBatchMountItem: ", i15, " at index: "));
                            }
                            int[] iArr6 = this.intBuffer;
                            i12 = i15 + 5;
                            surfaceManager.updateOverflowInset(iArr6[i15], iArr6[i15 + 1], iArr6[i15 + 2], iArr6[i15 + 3], iArr6[i15 + 4]);
                        }
                        i15 = i12;
                    } else {
                        int i28 = i19 + 1;
                        EventEmitterWrapper eventEmitterWrapper2 = (EventEmitterWrapper) this.objBuffer[i19];
                        if (eventEmitterWrapper2 != null) {
                            surfaceManager.updateEventEmitter(this.intBuffer[i15], eventEmitterWrapper2);
                            i19 = i28;
                            i15++;
                        } else {
                            i19 = i28;
                        }
                    }
                    i15 = i10;
                    i19 = i11;
                } else {
                    int[] iArr7 = this.intBuffer;
                    int i29 = iArr7[i15];
                    int i30 = i15 + 2;
                    int i31 = iArr7[i15 + 1];
                    i15 += 3;
                    surfaceManager.removeViewAt(i29, i31, iArr7[i30]);
                }
            }
            Trace.endSection();
            i13 = i15;
            i14 = i19;
        }
        endMarkers();
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.BatchMountItem
    public boolean isBatchEmpty() {
        return this.intBufferLen == 0;
    }

    @NotNull
    public String toString() {
        int i7;
        int i10;
        int i11;
        int i12;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i13 = 1;
            String str = String.format(Locale.ROOT, "IntBufferBatchMountItem [surface:%d]:\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.surfaceId)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sb2.append(str);
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.intBufferLen) {
                int[] iArr = this.intBuffer;
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                int i18 = i17 & (-2);
                if ((i17 & i13) != 0) {
                    int i19 = i14 + 2;
                    i7 = iArr[i16];
                    i16 = i19;
                } else {
                    i7 = i13;
                }
                i14 = i16;
                int i20 = 0;
                while (i20 < i7) {
                    if (i18 != 2) {
                        if (i18 == 4) {
                            i10 = i14 + 1;
                            String str2 = String.format(Locale.ROOT, "DELETE [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14])}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                            sb2.append(str2);
                        } else if (i18 == 8) {
                            Locale locale = Locale.ROOT;
                            Integer numValueOf = Integer.valueOf(this.intBuffer[i14]);
                            int i21 = i14 + 2;
                            Integer numValueOf2 = Integer.valueOf(this.intBuffer[i14 + 1]);
                            i14 += 3;
                            String str3 = String.format(locale, "INSERT [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, Integer.valueOf(this.intBuffer[i21])}, 3));
                            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                            sb2.append(str3);
                        } else if (i18 != 16) {
                            String string = "<hidden>";
                            if (i18 == 32) {
                                i11 = i15 + 1;
                                Object obj = this.objBuffer[i15];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (obj == null || (string = obj.toString()) == null)) {
                                    string = "<null>";
                                }
                                i12 = i14 + 1;
                                String str4 = String.format(Locale.ROOT, "UPDATE PROPS [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14]), string}, 2));
                                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                                sb2.append(str4);
                            } else if (i18 == 64) {
                                i11 = i15 + 1;
                                StateWrapper stateWrapper = (StateWrapper) this.objBuffer[i15];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (stateWrapper == null || (string = stateWrapper.toString()) == null)) {
                                    string = "<null>";
                                }
                                i12 = i14 + 1;
                                String str5 = String.format(Locale.ROOT, "UPDATE STATE [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14]), string}, 2));
                                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                                sb2.append(str5);
                            } else if (i18 == 128) {
                                Locale locale2 = Locale.ROOT;
                                Integer numValueOf3 = Integer.valueOf(this.intBuffer[i14]);
                                Integer numValueOf4 = Integer.valueOf(this.intBuffer[i14 + 1]);
                                Integer numValueOf5 = Integer.valueOf(this.intBuffer[i14 + 2]);
                                Integer numValueOf6 = Integer.valueOf(this.intBuffer[i14 + 3]);
                                Integer numValueOf7 = Integer.valueOf(this.intBuffer[i14 + 4]);
                                Integer numValueOf8 = Integer.valueOf(this.intBuffer[i14 + 5]);
                                int i22 = i14 + 7;
                                Integer numValueOf9 = Integer.valueOf(this.intBuffer[i14 + 6]);
                                i14 += 8;
                                String str6 = String.format(locale2, "UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection:%d\n", Arrays.copyOf(new Object[]{numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, Integer.valueOf(this.intBuffer[i22])}, 8));
                                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                                sb2.append(str6);
                            } else if (i18 == 256) {
                                i15++;
                                i10 = i14 + 1;
                                String str7 = String.format(Locale.ROOT, "UPDATE EVENTEMITTER [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i14])}, 1));
                                Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                                sb2.append(str7);
                            } else if (i18 == 512) {
                                Locale locale3 = Locale.ROOT;
                                Integer numValueOf10 = Integer.valueOf(this.intBuffer[i14]);
                                Integer numValueOf11 = Integer.valueOf(this.intBuffer[i14 + 1]);
                                Integer numValueOf12 = Integer.valueOf(this.intBuffer[i14 + 2]);
                                int i23 = i14 + 4;
                                Integer numValueOf13 = Integer.valueOf(this.intBuffer[i14 + 3]);
                                i14 += 5;
                                String str8 = String.format(locale3, "UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Arrays.copyOf(new Object[]{numValueOf10, numValueOf11, numValueOf12, numValueOf13, Integer.valueOf(this.intBuffer[i23])}, 5));
                                Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                                sb2.append(str8);
                            } else {
                                if (i18 != 1024) {
                                    p229p2.a.h(TAG, "String so far: " + ((Object) sb2));
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i18 + " at index: " + i14);
                                }
                                Locale locale4 = Locale.ROOT;
                                Integer numValueOf14 = Integer.valueOf(this.intBuffer[i14]);
                                Integer numValueOf15 = Integer.valueOf(this.intBuffer[i14 + 1]);
                                Integer numValueOf16 = Integer.valueOf(this.intBuffer[i14 + 2]);
                                int i24 = i14 + 4;
                                Integer numValueOf17 = Integer.valueOf(this.intBuffer[i14 + 3]);
                                i14 += 5;
                                String str9 = String.format(locale4, "UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Arrays.copyOf(new Object[]{numValueOf14, numValueOf15, numValueOf16, numValueOf17, Integer.valueOf(this.intBuffer[i24])}, 5));
                                Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
                                sb2.append(str9);
                            }
                            i15 = i11;
                            i14 = i12;
                        } else {
                            Locale locale5 = Locale.ROOT;
                            Integer numValueOf18 = Integer.valueOf(this.intBuffer[i14]);
                            int i25 = i14 + 2;
                            Integer numValueOf19 = Integer.valueOf(this.intBuffer[i14 + 1]);
                            i14 += 3;
                            String str10 = String.format(locale5, "REMOVE [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{numValueOf18, numValueOf19, Integer.valueOf(this.intBuffer[i25])}, 3));
                            Intrinsics.checkNotNullExpressionValue(str10, "format(...)");
                            sb2.append(str10);
                        }
                        i14 = i10;
                    } else {
                        String str11 = (String) this.objBuffer[i15];
                        if (str11 == null) {
                            str11 = "";
                        }
                        String fabricComponentName = FabricNameComponentMapping.getFabricComponentName(str11);
                        i15 += 4;
                        Locale locale6 = Locale.ROOT;
                        int i26 = i14 + 1;
                        Integer numValueOf20 = Integer.valueOf(this.intBuffer[i14]);
                        i14 += 2;
                        String str12 = String.format(locale6, "CREATE [%d] - layoutable:%d - %s\n", Arrays.copyOf(new Object[]{numValueOf20, Integer.valueOf(this.intBuffer[i26]), fabricComponentName}, 3));
                        Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
                        sb2.append(str12);
                    }
                    i20++;
                    i13 = 1;
                }
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        } catch (Exception e10) {
            p229p2.a.i(TAG, "Caught exception trying to print", e10);
            StringBuilder sb3 = new StringBuilder();
            for (int i27 = 0; i27 < this.intBufferLen; i27++) {
                sb3.append(this.intBuffer[i27]);
                sb3.append(", ");
            }
            p229p2.a.h(TAG, sb3.toString());
            for (int i28 = 0; i28 < this.objBufferLen; i28++) {
                String str13 = TAG;
                Object obj2 = this.objBuffer[i28];
                p229p2.a.h(str13, obj2 != null ? String.valueOf(obj2) : BuildConfig.TRAVIS);
            }
            return "";
        }
    }
}
