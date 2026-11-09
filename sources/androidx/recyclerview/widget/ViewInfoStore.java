package androidx.recyclerview.widget;

import M.j;
import M.k;
import M.n;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SimplePool;

/* JADX INFO: loaded from: classes.dex */
class ViewInfoStore {
    private static final boolean DEBUG = false;

    @VisibleForTesting
    final n mLayoutHolderMap = new n(0);

    @VisibleForTesting
    final j mOldChangedHolders = new j();

    public static class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static Pools$Pool<InfoRecord> sPool = new Pools$SimplePool(20);
        int flags;

        @Nullable
        RecyclerView.ItemAnimator.ItemHolderInfo postInfo;

        @Nullable
        RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        public static void drainCache() {
            while (sPool.acquire() != null) {
            }
        }

        public static InfoRecord obtain() {
            InfoRecord infoRecordAcquire = sPool.acquire();
            return infoRecordAcquire == null ? new InfoRecord() : infoRecordAcquire;
        }

        public static void recycle(InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.release(infoRecord);
        }
    }

    public interface ProcessCallback {
        void processAppeared(RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(RecyclerView.ViewHolder viewHolder);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i7) {
        InfoRecord infoRecord;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int iD = this.mLayoutHolderMap.d(viewHolder);
        if (iD >= 0 && (infoRecord = (InfoRecord) this.mLayoutHolderMap.j(iD)) != null) {
            int i10 = infoRecord.flags;
            if ((i10 & i7) != 0) {
                int i11 = (~i7) & i10;
                infoRecord.flags = i11;
                if (i7 == 4) {
                    itemHolderInfo = infoRecord.preInfo;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = infoRecord.postInfo;
                }
                if ((i11 & 12) == 0) {
                    this.mLayoutHolderMap.h(iD);
                    InfoRecord.recycle(infoRecord);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordObtain = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.flags |= 2;
        infoRecordObtain.preInfo = itemHolderInfo;
    }

    public void addToDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecordObtain = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.flags |= 1;
    }

    public void addToOldChangeHolders(long j6, RecyclerView.ViewHolder viewHolder) {
        this.mOldChangedHolders.e(j6, viewHolder);
    }

    public void addToPostLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordObtain = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.postInfo = itemHolderInfo;
        infoRecordObtain.flags |= 8;
    }

    public void addToPreLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordObtain = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.preInfo = itemHolderInfo;
        infoRecordObtain.flags |= 4;
    }

    public void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.a();
    }

    public RecyclerView.ViewHolder getFromOldChangeHolders(long j6) {
        return (RecyclerView.ViewHolder) this.mOldChangedHolders.b(j6);
    }

    public boolean isDisappearing(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 1) == 0) ? false : true;
    }

    public boolean isInPreLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 4) == 0) ? false : true;
    }

    public void onDetach() {
        InfoRecord.drainCache();
    }

    public void onViewDetached(RecyclerView.ViewHolder viewHolder) {
        removeFromDisappearedInLayout(viewHolder);
    }

    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 8);
    }

    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 4);
    }

    public void process(ProcessCallback processCallback) {
        for (int i7 = this.mLayoutHolderMap.f5695c - 1; i7 >= 0; i7--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.mLayoutHolderMap.f(i7);
            InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.h(i7);
            int i10 = infoRecord.flags;
            if ((i10 & 3) == 3) {
                processCallback.unused(viewHolder);
            } else if ((i10 & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = infoRecord.preInfo;
                if (itemHolderInfo == null) {
                    processCallback.unused(viewHolder);
                } else {
                    processCallback.processDisappeared(viewHolder, itemHolderInfo, infoRecord.postInfo);
                }
            } else if ((i10 & 14) == 14) {
                processCallback.processAppeared(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
            } else if ((i10 & 12) == 12) {
                processCallback.processPersistent(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
            } else if ((i10 & 4) != 0) {
                processCallback.processDisappeared(viewHolder, infoRecord.preInfo, null);
            } else if ((i10 & 8) != 0) {
                processCallback.processAppeared(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
            }
            InfoRecord.recycle(infoRecord);
        }
    }

    public void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.flags &= -2;
    }

    public void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
        for (int iG = this.mOldChangedHolders.g() - 1; iG >= 0; iG--) {
            if (viewHolder == this.mOldChangedHolders.h(iG)) {
                j jVar = this.mOldChangedHolders;
                Object[] objArr = jVar.f5686c;
                Object obj = objArr[iG];
                Object obj2 = k.f5688a;
                if (obj == obj2) {
                    break;
                }
                objArr[iG] = obj2;
                jVar.f5684a = true;
                break;
            }
        }
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.remove(viewHolder);
        if (infoRecord != null) {
            InfoRecord.recycle(infoRecord);
        }
    }
}
