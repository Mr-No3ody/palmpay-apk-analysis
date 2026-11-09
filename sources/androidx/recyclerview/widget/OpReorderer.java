package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class OpReorderer {
    final Callback mCallback;

    public interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i7, int i10, int i11, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z3 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z3 = true;
            } else if (z3) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i7, AdapterHelper.UpdateOp updateOp, int i10, AdapterHelper.UpdateOp updateOp2) {
        int i11 = updateOp.itemCount;
        int i12 = updateOp2.positionStart;
        int i13 = i11 < i12 ? -1 : 0;
        int i14 = updateOp.positionStart;
        if (i14 < i12) {
            i13++;
        }
        if (i12 <= i14) {
            updateOp.positionStart = i14 + updateOp2.itemCount;
        }
        int i15 = updateOp2.positionStart;
        if (i15 <= i11) {
            updateOp.itemCount = i11 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i15 + i13;
        list.set(i7, updateOp2);
        list.set(i10, updateOp);
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i7, int i10) {
        AdapterHelper.UpdateOp updateOp = list.get(i7);
        AdapterHelper.UpdateOp updateOp2 = list.get(i10);
        int i11 = updateOp2.cmd;
        if (i11 == 1) {
            swapMoveAdd(list, i7, updateOp, i10, updateOp2);
        } else if (i11 == 2) {
            swapMoveRemove(list, i7, updateOp, i10, updateOp2);
        } else {
            if (i11 != 4) {
                return;
            }
            swapMoveUpdate(list, i7, updateOp, i10, updateOp2);
        }
    }

    public void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder == -1) {
                return;
            } else {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            }
        }
    }

    public void swapMoveRemove(List<AdapterHelper.UpdateOp> list, int i7, AdapterHelper.UpdateOp updateOp, int i10, AdapterHelper.UpdateOp updateOp2) {
        boolean z3;
        int i11 = updateOp.positionStart;
        int i12 = updateOp.itemCount;
        boolean z8 = false;
        if (i11 < i12) {
            if (updateOp2.positionStart == i11 && updateOp2.itemCount == i12 - i11) {
                z3 = false;
                z8 = true;
            } else {
                z3 = false;
            }
        } else if (updateOp2.positionStart == i12 + 1 && updateOp2.itemCount == i11 - i12) {
            z3 = true;
            z8 = true;
        } else {
            z3 = true;
        }
        int i13 = updateOp2.positionStart;
        if (i12 < i13) {
            updateOp2.positionStart = i13 - 1;
        } else {
            int i14 = updateOp2.itemCount;
            if (i12 < i13 + i14) {
                updateOp2.itemCount = i14 - 1;
                updateOp.cmd = 2;
                updateOp.itemCount = 1;
                if (updateOp2.itemCount == 0) {
                    list.remove(i10);
                    this.mCallback.recycleUpdateOp(updateOp2);
                    return;
                }
                return;
            }
        }
        int i15 = updateOp.positionStart;
        int i16 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOpObtainUpdateOp = null;
        if (i15 <= i16) {
            updateOp2.positionStart = i16 + 1;
        } else {
            int i17 = updateOp2.itemCount;
            if (i15 < i16 + i17) {
                updateOpObtainUpdateOp = this.mCallback.obtainUpdateOp(2, i15 + 1, (i16 + i17) - i15, null);
                updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
            }
        }
        if (z8) {
            list.set(i7, updateOp2);
            list.remove(i10);
            this.mCallback.recycleUpdateOp(updateOp);
            return;
        }
        if (z3) {
            if (updateOpObtainUpdateOp != null) {
                int i18 = updateOp.positionStart;
                if (i18 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i18 - updateOpObtainUpdateOp.itemCount;
                }
                int i19 = updateOp.itemCount;
                if (i19 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i19 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i20 = updateOp.positionStart;
            if (i20 > updateOp2.positionStart) {
                updateOp.positionStart = i20 - updateOp2.itemCount;
            }
            int i21 = updateOp.itemCount;
            if (i21 > updateOp2.positionStart) {
                updateOp.itemCount = i21 - updateOp2.itemCount;
            }
        } else {
            if (updateOpObtainUpdateOp != null) {
                int i22 = updateOp.positionStart;
                if (i22 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i22 - updateOpObtainUpdateOp.itemCount;
                }
                int i23 = updateOp.itemCount;
                if (i23 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i23 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i24 = updateOp.positionStart;
            if (i24 >= updateOp2.positionStart) {
                updateOp.positionStart = i24 - updateOp2.itemCount;
            }
            int i25 = updateOp.itemCount;
            if (i25 >= updateOp2.positionStart) {
                updateOp.itemCount = i25 - updateOp2.itemCount;
            }
        }
        list.set(i7, updateOp2);
        if (updateOp.positionStart != updateOp.itemCount) {
            list.set(i10, updateOp);
        } else {
            list.remove(i10);
        }
        if (updateOpObtainUpdateOp != null) {
            list.add(i7, updateOpObtainUpdateOp);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public void swapMoveUpdate(List<AdapterHelper.UpdateOp> list, int i7, AdapterHelper.UpdateOp updateOp, int i10, AdapterHelper.UpdateOp updateOp2) {
        AdapterHelper.UpdateOp updateOpObtainUpdateOp;
        int i11;
        int i12;
        int i13;
        int i14 = updateOp.itemCount;
        int i15 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOpObtainUpdateOp2 = null;
        if (i14 >= i15) {
            int i16 = updateOp2.itemCount;
            if (i14 < i15 + i16) {
                updateOp2.itemCount = i16 - 1;
                updateOpObtainUpdateOp = this.mCallback.obtainUpdateOp(4, updateOp.positionStart, 1, updateOp2.payload);
            }
            i11 = updateOp.positionStart;
            i12 = updateOp2.positionStart;
            if (i11 <= i12) {
                updateOp2.positionStart = i12 + 1;
            } else {
                i13 = updateOp2.itemCount;
                if (i11 < i12 + i13) {
                    int i17 = (i12 + i13) - i11;
                    updateOpObtainUpdateOp2 = this.mCallback.obtainUpdateOp(4, i11 + 1, i17, updateOp2.payload);
                    updateOp2.itemCount -= i17;
                }
            }
            list.set(i10, updateOp);
            if (updateOp2.itemCount > 0) {
                list.set(i7, updateOp2);
            } else {
                list.remove(i7);
                this.mCallback.recycleUpdateOp(updateOp2);
            }
            if (updateOpObtainUpdateOp != null) {
                list.add(i7, updateOpObtainUpdateOp);
            }
            if (updateOpObtainUpdateOp2 != null) {
                list.add(i7, updateOpObtainUpdateOp2);
            }
        }
        updateOp2.positionStart = i15 - 1;
        updateOpObtainUpdateOp = null;
        i11 = updateOp.positionStart;
        i12 = updateOp2.positionStart;
        if (i11 <= i12) {
            updateOp2.positionStart = i12 + 1;
        } else {
            i13 = updateOp2.itemCount;
            if (i11 < i12 + i13) {
                int i18 = (i12 + i13) - i11;
                updateOpObtainUpdateOp2 = this.mCallback.obtainUpdateOp(4, i11 + 1, i18, updateOp2.payload);
                updateOp2.itemCount -= i18;
            }
        }
        list.set(i10, updateOp);
        if (updateOp2.itemCount > 0) {
            list.set(i7, updateOp2);
        } else {
            list.remove(i7);
            this.mCallback.recycleUpdateOp(updateOp2);
        }
        if (updateOpObtainUpdateOp != null) {
            list.add(i7, updateOpObtainUpdateOp);
        }
        if (updateOpObtainUpdateOp2 != null) {
            list.add(i7, updateOpObtainUpdateOp2);
        }
    }
}
