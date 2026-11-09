package androidx.recyclerview.widget;

import android.view.View;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
class ViewBoundsCheck {
    static final int CVE_PVE_POS = 12;
    static final int CVE_PVS_POS = 8;
    static final int CVS_PVE_POS = 4;
    static final int CVS_PVS_POS = 0;
    static final int EQ = 2;
    static final int FLAG_CVE_EQ_PVE = 8192;
    static final int FLAG_CVE_EQ_PVS = 512;
    static final int FLAG_CVE_GT_PVE = 4096;
    static final int FLAG_CVE_GT_PVS = 256;
    static final int FLAG_CVE_LT_PVE = 16384;
    static final int FLAG_CVE_LT_PVS = 1024;
    static final int FLAG_CVS_EQ_PVE = 32;
    static final int FLAG_CVS_EQ_PVS = 2;
    static final int FLAG_CVS_GT_PVE = 16;
    static final int FLAG_CVS_GT_PVS = 1;
    static final int FLAG_CVS_LT_PVE = 64;
    static final int FLAG_CVS_LT_PVS = 4;
    static final int GT = 1;
    static final int LT = 4;
    static final int MASK = 7;
    BoundFlags mBoundFlags = new BoundFlags();
    final Callback mCallback;

    public static class BoundFlags {
        int mBoundFlags = 0;
        int mChildEnd;
        int mChildStart;
        int mRvEnd;
        int mRvStart;

        public void addFlags(int i7) {
            this.mBoundFlags = i7 | this.mBoundFlags;
        }

        public boolean boundsMatch() {
            int i7 = this.mBoundFlags;
            if ((i7 & 7) != 0 && (i7 & compare(this.mChildStart, this.mRvStart)) == 0) {
                return false;
            }
            int i10 = this.mBoundFlags;
            if ((i10 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) != 0 && (i10 & (compare(this.mChildStart, this.mRvEnd) << 4)) == 0) {
                return false;
            }
            int i11 = this.mBoundFlags;
            if ((i11 & 1792) != 0 && (i11 & (compare(this.mChildEnd, this.mRvStart) << 8)) == 0) {
                return false;
            }
            int i12 = this.mBoundFlags;
            return (i12 & 28672) == 0 || (i12 & (compare(this.mChildEnd, this.mRvEnd) << 12)) != 0;
        }

        public int compare(int i7, int i10) {
            if (i7 > i10) {
                return 1;
            }
            return i7 == i10 ? 2 : 4;
        }

        public void resetFlags() {
            this.mBoundFlags = 0;
        }

        public void setBounds(int i7, int i10, int i11, int i12) {
            this.mRvStart = i7;
            this.mRvEnd = i10;
            this.mChildStart = i11;
            this.mChildEnd = i12;
        }
    }

    public interface Callback {
        View getChildAt(int i7);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.mCallback = callback;
    }

    public View findOneViewWithinBoundFlags(int i7, int i10, int i11, int i12) {
        int parentStart = this.mCallback.getParentStart();
        int parentEnd = this.mCallback.getParentEnd();
        int i13 = i10 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i10) {
            View childAt = this.mCallback.getChildAt(i7);
            this.mBoundFlags.setBounds(parentStart, parentEnd, this.mCallback.getChildStart(childAt), this.mCallback.getChildEnd(childAt));
            if (i11 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i11);
                if (this.mBoundFlags.boundsMatch()) {
                    return childAt;
                }
            }
            if (i12 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i12);
                if (this.mBoundFlags.boundsMatch()) {
                    view = childAt;
                }
            }
            i7 += i13;
        }
        return view;
    }

    public boolean isViewWithinBoundFlags(View view, int i7) {
        this.mBoundFlags.setBounds(this.mCallback.getParentStart(), this.mCallback.getParentEnd(), this.mCallback.getChildStart(view), this.mCallback.getChildEnd(view));
        if (i7 == 0) {
            return false;
        }
        this.mBoundFlags.resetFlags();
        this.mBoundFlags.addFlags(i7);
        return this.mBoundFlags.boundsMatch();
    }
}
