package com.facebook.react.fabric.mounting;

import Af.d;
import C0.G;
import E.AbstractC0198c;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.UiThread;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.react.bridge.ReactIgnorableMountingException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010\u001d\u001a\u00020\u0019H\u0007J\u0018\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0007J\b\u0010\u001e\u001a\u00020\u0019H\u0003J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0011H\u0007J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\fH\u0002J\u0010\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0003J\u0010\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&H\u0003J\u0010\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher;", "", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "itemDispatchListener", "Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "<init>", "(Lcom/facebook/react/fabric/mounting/MountingManager;Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;)V", "viewCommandMountItems", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "mountItems", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "preMountItems", "inDispatch", "", "value", "", "batchedExecutionTime", "getBatchedExecutionTime", "()J", "runStartTime", "getRunStartTime", "lastFrameTimeNanos", "addViewCommandMountItem", "", "mountItem", "addMountItem", "addPreAllocateMountItem", "tryDispatchMountItems", "dispatchMountItems", "dispatchPreMountItems", "frameTimeNanos", "dispatchPreMountItemsImpl", "deadline", "executeOrEnqueue", "item", "getAndResetViewCommandMountItems", "", "getAndResetMountItems", "getAndResetPreMountItems", "ItemDispatchListener", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMountItemDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class MountItemDispatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long FRAME_TIME_NS = 16666666;

    @NotNull
    private static final String TAG = "MountItemDispatcher";
    private long batchedExecutionTime;
    private boolean inDispatch;

    @NotNull
    private final ItemDispatchListener itemDispatchListener;
    private long lastFrameTimeNanos;

    @NotNull
    private final Queue<MountItem> mountItems;

    @NotNull
    private final MountingManager mountingManager;

    @NotNull
    private final Queue<MountItem> preMountItems;
    private long runStartTime;

    @NotNull
    private final Queue<DispatchCommandMountItem> viewCommandMountItems;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$Companion;", "", "<init>", "()V", "TAG", "", "FRAME_TIME_NS", "", "drainConcurrentItemQueue", "", "E", "queue", "Ljava/util/Queue;", "printMountItem", "", "mountItem", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "prefix", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMountItemDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,366:1\n1#2:367\n739#3,9:368\n*S KotlinDebug\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher$Companion\n*L\n358#1:368,9\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <E> List<E> drainConcurrentItemQueue(Queue<E> queue) {
            if (queue.isEmpty()) {
                return null;
            }
            d dVarB = C1849p.b();
            do {
                E ePoll = queue.poll();
                if (ePoll != null) {
                    dVarB.add(ePoll);
                }
            } while (!queue.isEmpty());
            d dVarA = C1849p.a(dVarB);
            if (dVarA.isEmpty()) {
                return null;
            }
            return dVarA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void printMountItem(MountItem mountItem, String prefix) {
            List listU;
            List listSplit$default = StringsKt__StringsKt.split$default(mountItem.toString(), new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, null);
            if (!listSplit$default.isEmpty()) {
                ListIterator listIterator = listSplit$default.listIterator(listSplit$default.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listU = z.f38935a;
                        break;
                    } else if (((String) listIterator.previous()).length() != 0) {
                        listU = CollectionsKt.U(listSplit$default, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listU = z.f38935a;
                break;
            }
            Iterator it = listU.iterator();
            while (it.hasNext()) {
                a.h(MountItemDispatcher.TAG, prefix + ": " + ((String) it.next()));
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "", "willMountItems", "", "mountItems", "", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "didMountItems", "didDispatchMountItems", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(@Nullable List<? extends MountItem> mountItems);

        void willMountItems(@Nullable List<? extends MountItem> mountItems);
    }

    public MountItemDispatcher(@NotNull MountingManager mountingManager, @NotNull ItemDispatchListener itemDispatchListener) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        Intrinsics.checkNotNullParameter(itemDispatchListener, "itemDispatchListener");
        this.mountingManager = mountingManager;
        this.itemDispatchListener = itemDispatchListener;
        this.viewCommandMountItems = new ConcurrentLinkedQueue();
        this.mountItems = new ConcurrentLinkedQueue();
        this.preMountItems = new ConcurrentLinkedQueue();
    }

    private final void dispatchPreMountItemsImpl(long deadline) {
        MountItem mountItemPoll;
        Intrinsics.checkNotNullParameter("MountItemDispatcher::premountViews", "sectionName");
        AbstractC0198c.e("MountItemDispatcher::premountViews");
        this.inDispatch = true;
        while (System.nanoTime() <= deadline && (mountItemPoll = this.preMountItems.poll()) != null) {
            try {
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(mountItemPoll, "dispatchPreMountItems");
                }
                executeOrEnqueue(mountItemPoll);
            } catch (Throwable th) {
                this.inDispatch = false;
                throw th;
            }
        }
        this.inDispatch = false;
        Trace.endSection();
    }

    private final void executeOrEnqueue(MountItem item) {
        if (!this.mountingManager.isWaitingForViewAttach(item.get_surfaceId())) {
            item.execute(this.mountingManager);
            return;
        }
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            a.j(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(item.get_surfaceId()));
        }
        this.mountingManager.getSurfaceManagerEnforced(item.get_surfaceId(), "MountItemDispatcher::executeOrEnqueue").scheduleMountItemOnViewAttach(item);
    }

    @ThreadConfined("UI")
    @UiThread
    private final List<MountItem> getAndResetMountItems() {
        return Companion.drainConcurrentItemQueue(this.mountItems);
    }

    @ThreadConfined("UI")
    @UiThread
    private final List<MountItem> getAndResetPreMountItems() {
        return Companion.drainConcurrentItemQueue(this.preMountItems);
    }

    @ThreadConfined("UI")
    @UiThread
    private final List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return Companion.drainConcurrentItemQueue(this.viewCommandMountItems);
    }

    public final void addMountItem(@NotNull MountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        this.mountItems.add(mountItem);
    }

    public final void addPreAllocateMountItem(@NotNull MountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        if (!this.mountingManager.surfaceIsStopped(mountItem.get_surfaceId())) {
            this.preMountItems.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            a.j(TAG, "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.get_surfaceId()), mountItem.toString());
        }
    }

    public final void addViewCommandMountItem(@NotNull DispatchCommandMountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        this.viewCommandMountItems.add(mountItem);
    }

    @ThreadConfined("UI")
    @UiThread
    public final void dispatchMountItems(@NotNull Queue<MountItem> mountItems) {
        Intrinsics.checkNotNullParameter(mountItems, "mountItems");
        while (!mountItems.isEmpty()) {
            MountItem mountItemPoll = mountItems.poll();
            if (mountItemPoll == null) {
                throw new IllegalArgumentException("MountItem should not be null");
            }
            MountItem mountItem = mountItemPoll;
            try {
                mountItem.execute(this.mountingManager);
            } catch (RetryableMountingLayerException e10) {
                if (mountItem instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) mountItem;
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else {
                    Companion.printMountItem(mountItem, G.o("dispatchExternalMountItems: mounting failed with ", e10.getMessage()));
                }
            }
        }
    }

    @ThreadConfined("UI")
    @UiThread
    public final void dispatchPreMountItems(long frameTimeNanos) {
        this.lastFrameTimeNanos = frameTimeNanos;
        if (this.preMountItems.isEmpty()) {
            return;
        }
        dispatchPreMountItemsImpl(this.lastFrameTimeNanos + 8333333);
    }

    public final long getBatchedExecutionTime() {
        return this.batchedExecutionTime;
    }

    public final long getRunStartTime() {
        return this.runStartTime;
    }

    @ThreadConfined("UI")
    @UiThread
    public final void tryDispatchMountItems() {
        if (this.inDispatch) {
            return;
        }
        this.inDispatch = true;
        try {
            dispatchMountItems();
            this.inDispatch = false;
            this.itemDispatchListener.didDispatchMountItems();
        } catch (Throwable th) {
            this.inDispatch = false;
            throw th;
        }
    }

    @ThreadConfined("UI")
    @UiThread
    private final void dispatchMountItems() {
        SurfaceMountingManager surfaceManager;
        this.batchedExecutionTime = 0L;
        this.runStartTime = SystemClock.uptimeMillis();
        List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems == null && andResetViewCommandMountItems == null) {
            return;
        }
        this.itemDispatchListener.willMountItems(andResetMountItems);
        if (andResetViewCommandMountItems != null) {
            Intrinsics.checkNotNullParameter("MountItemDispatcher::mountViews viewCommandMountItems", "sectionName");
            Trace.beginSection(AbstractC0198c.m0("MountItemDispatcher::mountViews viewCommandMountItems"));
            for (DispatchCommandMountItem dispatchCommandMountItem : andResetViewCommandMountItems) {
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(dispatchCommandMountItem, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    executeOrEnqueue(dispatchCommandMountItem);
                } catch (RetryableMountingLayerException e10) {
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    } else {
                        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + dispatchCommandMountItem, e10));
                    }
                } catch (Throwable th) {
                    ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + dispatchCommandMountItem, th));
                }
            }
            Trace.endSection();
        }
        List<MountItem> andResetPreMountItems = getAndResetPreMountItems();
        if (andResetPreMountItems != null) {
            Intrinsics.checkNotNullParameter("MountItemDispatcher::mountViews preMountItems", "sectionName");
            Trace.beginSection(AbstractC0198c.m0("MountItemDispatcher::mountViews preMountItems"));
            for (MountItem mountItem : andResetPreMountItems) {
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                executeOrEnqueue(mountItem);
            }
            Trace.endSection();
        }
        if (andResetMountItems != null) {
            Intrinsics.checkNotNullParameter("MountItemDispatcher::mountViews mountItems to execute", "sectionName");
            Trace.beginSection(AbstractC0198c.m0("MountItemDispatcher::mountViews mountItems to execute"));
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (MountItem mountItem2 : andResetMountItems) {
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(mountItem2, "dispatchMountItems: Executing mountItem");
                }
                try {
                    executeOrEnqueue(mountItem2);
                } catch (Throwable th2) {
                    a.i(TAG, "dispatchMountItems: caught exception, displaying mount state", th2);
                    for (MountItem mountItem3 : andResetMountItems) {
                        if (mountItem3 == mountItem2) {
                            a.h(TAG, "dispatchMountItems: mountItem: next mountItem triggered exception!");
                        }
                        Companion.printMountItem(mountItem3, "dispatchMountItems: mountItem");
                    }
                    if (mountItem2.get_surfaceId() != -1 && (surfaceManager = this.mountingManager.getSurfaceManager(mountItem2.get_surfaceId())) != null) {
                        surfaceManager.printSurfaceState();
                    }
                    if (ReactIgnorableMountingException.INSTANCE.isIgnorable(th2)) {
                        ReactSoftExceptionLogger.logSoftException(TAG, th2);
                    } else {
                        throw th2;
                    }
                }
            }
            this.batchedExecutionTime = (SystemClock.uptimeMillis() - jUptimeMillis) + this.batchedExecutionTime;
            Trace.endSection();
        }
        this.itemDispatchListener.didMountItems(andResetMountItems);
    }
}
