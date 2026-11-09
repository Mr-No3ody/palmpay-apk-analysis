package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f15462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15464c;

    public w(Context context, x xVar, XmlResourceParser xmlResourceParser) {
        this.f15463b = -1;
        this.f15464c = 17;
        this.f15462a = xVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.p.OnClick);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == androidx.constraintlayout.widget.p.OnClick_targetId) {
                this.f15463b = typedArrayObtainStyledAttributes.getResourceId(index, this.f15463b);
            } else if (index == androidx.constraintlayout.widget.p.OnClick_clickAction) {
                this.f15464c = typedArrayObtainStyledAttributes.getInt(index, this.f15464c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(MotionLayout motionLayout, int i7, x xVar) {
        boolean z3;
        View viewFindViewById;
        int i10 = this.f15463b;
        View view = motionLayout;
        if (i10 != -1) {
            viewFindViewById = motionLayout.findViewById(i10);
        }
        if (view == null) {
            view = viewFindViewById;
            Log.e("MotionScene", "OnClick could not find id " + i10);
            return;
        }
        int i11 = xVar.f15468d;
        int i12 = xVar.f15467c;
        if (i11 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i13 = this.f15464c;
        int i14 = i13 & 1;
        if (i14 == 0 || i7 != i11) {
            view = viewFindViewById;
            z3 = false;
        } else {
            z3 = true;
        }
        if (((i14 != 0 && i7 == i11) | z3 | ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 && i7 == i11) | ((i13 & 16) != 0 && i7 == i12)) || ((i13 & 4096) != 0 && i7 == i12)) {
            view.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i7 = this.f15463b;
        if (i7 == -1) {
            return;
        }
        View viewFindViewById = motionLayout.findViewById(i7);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i7);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x xVar = this.f15462a;
        y yVar = xVar.f15474j;
        MotionLayout motionLayout = yVar.f15483a;
        if (motionLayout.f15304o) {
            if (xVar.f15468d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.z(xVar.f15467c);
                    return;
                }
                x xVar2 = new x(xVar.f15474j, xVar);
                xVar2.f15468d = currentState;
                xVar2.f15467c = xVar.f15467c;
                motionLayout.setTransition(xVar2);
                motionLayout.x();
                return;
            }
            x xVar3 = yVar.f15485c;
            int i7 = this.f15464c;
            boolean z3 = false;
            boolean z8 = true;
            boolean z10 = ((i7 & 1) == 0 && (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) ? false : true;
            if ((i7 & 16) == 0 && (i7 & 4096) == 0) {
                z8 = false;
            }
            if (z10 && z8) {
                if (xVar3 != xVar) {
                    motionLayout.setTransition(xVar);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z8 = false;
                    z3 = z10;
                }
            } else {
                z3 = z10;
            }
            if (xVar != xVar3) {
                int i10 = xVar.f15467c;
                int i11 = xVar.f15468d;
                if (i11 != -1) {
                    int i12 = motionLayout.f15299f;
                    if (i12 != i11 && i12 != i10) {
                        return;
                    }
                } else if (motionLayout.f15299f == i10) {
                    return;
                }
            }
            if (z3 && (i7 & 1) != 0) {
                motionLayout.setTransition(xVar);
                motionLayout.x();
                return;
            }
            if (z8 && (i7 & 16) != 0) {
                motionLayout.setTransition(xVar);
                motionLayout.y();
            } else if (z3 && (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                motionLayout.setTransition(xVar);
                motionLayout.setProgress(1.0f);
            } else {
                if (!z8 || (i7 & 4096) == 0) {
                    return;
                }
                motionLayout.setTransition(xVar);
                motionLayout.setProgress(0.0f);
            }
        }
    }
}
