package p015ag;

import Wf.O;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11971b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadSafeHeapNode[] f11972a;

    public final void a(O o10) {
        o10.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f11972a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11971b;
        if (threadSafeHeapNodeArr == null) {
            threadSafeHeapNodeArr = new ThreadSafeHeapNode[4];
            this.f11972a = threadSafeHeapNodeArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= threadSafeHeapNodeArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(threadSafeHeapNodeArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            threadSafeHeapNodeArr = (ThreadSafeHeapNode[]) objArrCopyOf;
            this.f11972a = threadSafeHeapNodeArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        threadSafeHeapNodeArr[i7] = o10;
        o10.f10818b = i7;
        c(i7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:9:0x003c->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[EDGE_INSN: B:24:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final ThreadSafeHeapNode b(int i7) {
        int i10;
        int i11;
        ThreadSafeHeapNode[] threadSafeHeapNodeArr;
        int i12;
        ThreadSafeHeapNode threadSafeHeapNode;
        ThreadSafeHeapNode threadSafeHeapNode2;
        ThreadSafeHeapNode threadSafeHeapNode3;
        ThreadSafeHeapNode threadSafeHeapNode4;
        ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = this.f11972a;
        Intrinsics.e(threadSafeHeapNodeArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11971b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            d(i7, atomicIntegerFieldUpdater.get(this));
            int i13 = (i7 - 1) / 2;
            if (i7 > 0) {
                ThreadSafeHeapNode threadSafeHeapNode5 = threadSafeHeapNodeArr2[i7];
                Intrinsics.e(threadSafeHeapNode5);
                ThreadSafeHeapNode threadSafeHeapNode6 = threadSafeHeapNodeArr2[i13];
                Intrinsics.e(threadSafeHeapNode6);
                if (((Comparable) threadSafeHeapNode5).compareTo(threadSafeHeapNode6) < 0) {
                    d(i7, i13);
                    c(i13);
                } else {
                    while (true) {
                        i10 = i7 * 2;
                        i11 = i10 + 1;
                        if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        threadSafeHeapNodeArr = this.f11972a;
                        Intrinsics.e(threadSafeHeapNodeArr);
                        i12 = i10 + 2;
                        if (i12 < atomicIntegerFieldUpdater.get(this)) {
                            threadSafeHeapNode3 = threadSafeHeapNodeArr[i12];
                            Intrinsics.e(threadSafeHeapNode3);
                            threadSafeHeapNode4 = threadSafeHeapNodeArr[i11];
                            Intrinsics.e(threadSafeHeapNode4);
                            if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) >= 0) {
                                i12 = i11;
                            }
                        } else {
                            i12 = i11;
                        }
                        threadSafeHeapNode = threadSafeHeapNodeArr[i7];
                        Intrinsics.e(threadSafeHeapNode);
                        threadSafeHeapNode2 = threadSafeHeapNodeArr[i12];
                        Intrinsics.e(threadSafeHeapNode2);
                        if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                            break;
                        }
                        d(i7, i12);
                        i7 = i12;
                    }
                }
            } else {
                while (true) {
                    i10 = i7 * 2;
                    i11 = i10 + 1;
                    if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    threadSafeHeapNodeArr = this.f11972a;
                    Intrinsics.e(threadSafeHeapNodeArr);
                    i12 = i10 + 2;
                    if (i12 < atomicIntegerFieldUpdater.get(this)) {
                        threadSafeHeapNode3 = threadSafeHeapNodeArr[i12];
                        Intrinsics.e(threadSafeHeapNode3);
                        threadSafeHeapNode4 = threadSafeHeapNodeArr[i11];
                        Intrinsics.e(threadSafeHeapNode4);
                        if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) >= 0) {
                            i12 = i11;
                        }
                    } else {
                        i12 = i11;
                    }
                    threadSafeHeapNode = threadSafeHeapNodeArr[i7];
                    Intrinsics.e(threadSafeHeapNode);
                    threadSafeHeapNode2 = threadSafeHeapNodeArr[i12];
                    Intrinsics.e(threadSafeHeapNode2);
                    if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                        break;
                        break;
                    }
                    d(i7, i12);
                    i7 = i12;
                }
            }
        }
        ThreadSafeHeapNode threadSafeHeapNode7 = threadSafeHeapNodeArr2[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.e(threadSafeHeapNode7);
        threadSafeHeapNode7.setHeap(null);
        threadSafeHeapNode7.setIndex(-1);
        threadSafeHeapNodeArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return threadSafeHeapNode7;
    }

    public final void c(int i7) {
        while (i7 > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f11972a;
            Intrinsics.e(threadSafeHeapNodeArr);
            int i10 = (i7 - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i10];
            Intrinsics.e(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i7];
            Intrinsics.e(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            d(i7, i10);
            i7 = i10;
        }
    }

    public final void d(int i7, int i10) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f11972a;
        Intrinsics.e(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i10];
        Intrinsics.e(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i7];
        Intrinsics.e(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i7] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i10] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i7);
        threadSafeHeapNode2.setIndex(i10);
    }
}
