package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f18003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18007e;

    public TransitionSet() {
        this.f18003a = new ArrayList();
        this.f18004b = true;
        this.f18006d = false;
        this.f18007e = 0;
    }

    @Override // androidx.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(View view) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(f0 f0Var) {
        if (isValidTarget(f0Var.f18046b)) {
            for (Transition transition : this.f18003a) {
                if (transition.isValidTarget(f0Var.f18046b)) {
                    transition.captureEndValues(f0Var);
                    f0Var.f18047c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void capturePropagationValues(f0 f0Var) {
        super.capturePropagationValues(f0Var);
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).capturePropagationValues(f0Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        if (isValidTarget(f0Var.f18046b)) {
            for (Transition transition : this.f18003a) {
                if (transition.isValidTarget(f0Var.f18046b)) {
                    transition.captureStartValues(f0Var);
                    f0Var.f18047c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void createAnimators(ViewGroup viewGroup, g0 g0Var, g0 g0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Transition transition = (Transition) this.f18003a.get(i7);
            if (startDelay > 0 && (this.f18004b || i7 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, g0Var, g0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(View view, boolean z3) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).excludeTarget(view, z3);
        }
        return super.excludeTarget(view, z3);
    }

    public final void f(Transition transition) {
        this.f18003a.add(transition);
        transition.mParent = this;
        long j6 = this.mDuration;
        if (j6 >= 0) {
            transition.setDuration(j6);
        }
        if ((this.f18007e & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.f18007e & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.f18007e & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.f18007e & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
    }

    @Override // androidx.transition.Transition
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).forceToEnd(viewGroup);
        }
    }

    public final Transition g(int i7) {
        if (i7 < 0 || i7 >= this.f18003a.size()) {
            return null;
        }
        return (Transition) this.f18003a.get(i7);
    }

    public final void h(Transition transition) {
        this.f18003a.remove(transition);
        transition.mParent = null;
    }

    @Override // androidx.transition.Transition
    public final boolean hasAnimators() {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            if (((Transition) this.f18003a.get(i7)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    public final void i(long j6) {
        ArrayList arrayList;
        super.setDuration(j6);
        if (this.mDuration < 0 || (arrayList = this.f18003a) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).setDuration(j6);
        }
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((Transition) this.f18003a.get(i7)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        this.f18007e |= 1;
        ArrayList arrayList = this.f18003a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((Transition) this.f18003a.get(i7)).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    public final void k(int i7) {
        if (i7 == 0) {
            this.f18004b = true;
        } else {
            if (i7 != 1) {
                throw new AndroidRuntimeException(C0.G.m(i7, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f18004b = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void pause(View view) {
        super.pause(view);
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        a0 a0Var = new a0(this);
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            Transition transition = (Transition) this.f18003a.get(i7);
            transition.addListener(a0Var);
            transition.prepareAnimatorsForSeeking();
            long totalDurationMillis = transition.getTotalDurationMillis();
            if (this.f18004b) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j6 = this.mTotalDuration;
                transition.mSeekOffsetInParent = j6;
                this.mTotalDuration = j6 + totalDurationMillis;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(int i7) {
        for (int i10 = 0; i10 < this.f18003a.size(); i10++) {
            ((Transition) this.f18003a.get(i10)).removeTarget(i7);
        }
        return (TransitionSet) super.removeTarget(i7);
    }

    @Override // androidx.transition.Transition
    public final void resume(View view) {
        super.resume(view);
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void runAnimators() {
        if (this.f18003a.isEmpty()) {
            start();
            end();
            return;
        }
        b0 b0Var = new b0();
        b0Var.f18018a = this;
        Iterator it = this.f18003a.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).addListener(b0Var);
        }
        this.f18005c = this.f18003a.size();
        if (this.f18004b) {
            Iterator it2 = this.f18003a.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).runAnimators();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7 - 1)).addListener(new Z((Transition) this.f18003a.get(i7)));
        }
        Transition transition = (Transition) this.f18003a.get(0);
        if (transition != null) {
            transition.runAnimators();
        }
    }

    @Override // androidx.transition.Transition
    public final void setCanRemoveViews(boolean z3) {
        super.setCanRemoveViews(z3);
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).setCanRemoveViews(z3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    public final void setCurrentPlayTimeMillis(long j6, long j10) {
        long j11;
        long totalDurationMillis = getTotalDurationMillis();
        long j12 = 0;
        if (this.mParent != null) {
            if (j6 < 0 && j10 < 0) {
                return;
            }
            if (j6 > totalDurationMillis && j10 > totalDurationMillis) {
                return;
            }
        }
        boolean z3 = j6 < j10;
        if ((j6 >= 0 && j10 < 0) || (j6 <= totalDurationMillis && j10 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(Transition.TransitionNotification.f17998a, z3);
        }
        if (!this.f18004b) {
            int size = 1;
            while (true) {
                if (size >= this.f18003a.size()) {
                    size = this.f18003a.size();
                    break;
                } else if (((Transition) this.f18003a.get(size)).mSeekOffsetInParent > j10) {
                    break;
                } else {
                    size++;
                }
            }
            int i7 = size - 1;
            if (j6 >= j10) {
                while (true) {
                    if (i7 < this.f18003a.size()) {
                        Transition transition = (Transition) this.f18003a.get(i7);
                        long j13 = transition.mSeekOffsetInParent;
                        j11 = j12;
                        long j14 = j6 - j13;
                        if (j14 < j11) {
                            break;
                        }
                        transition.setCurrentPlayTimeMillis(j14, j10 - j13);
                        i7++;
                        j12 = j11;
                    }
                }
            } else {
                j11 = 0;
                while (i7 >= 0) {
                    Transition transition2 = (Transition) this.f18003a.get(i7);
                    long j15 = transition2.mSeekOffsetInParent;
                    long j16 = j6 - j15;
                    transition2.setCurrentPlayTimeMillis(j16, j10 - j15);
                    if (j16 >= 0) {
                        break;
                    } else {
                        i7--;
                    }
                }
            }
            if (this.mParent != null) {
                if ((j6 > totalDurationMillis || j10 > totalDurationMillis) && (j6 >= 0 || j10 < j11)) {
                    return;
                }
                if (j6 > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(Transition.TransitionNotification.f17999b, z3);
            }
        }
        for (int i10 = 0; i10 < this.f18003a.size(); i10++) {
            ((Transition) this.f18003a.get(i10)).setCurrentPlayTimeMillis(j6, j10);
        }
        j11 = j12;
        if (this.mParent != null) {
            if (j6 > totalDurationMillis) {
                return;
            } else {
                return;
            }
            if (j6 > totalDurationMillis) {
                this.mEnded = true;
            }
            notifyListeners(Transition.TransitionNotification.f17999b, z3);
        }
    }

    @Override // androidx.transition.Transition
    public final /* bridge */ /* synthetic */ Transition setDuration(long j6) {
        i(j6);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void setEpicenterCallback(O o10) {
        super.setEpicenterCallback(o10);
        this.f18007e |= 8;
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).setEpicenterCallback(o10);
        }
    }

    @Override // androidx.transition.Transition
    public final void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f18007e |= 4;
        if (this.f18003a != null) {
            for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
                ((Transition) this.f18003a.get(i7)).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void setPropagation(Y y8) {
        super.setPropagation(y8);
        this.f18007e |= 2;
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Transition) this.f18003a.get(i7)).setPropagation(y8);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition setStartDelay(long j6) {
        return (TransitionSet) super.setStartDelay(j6);
    }

    @Override // androidx.transition.Transition
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            StringBuilder sbT = C0.G.t(string, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sbT.append(((Transition) this.f18003a.get(i7)).toString(str + "  "));
            string = sbT.toString();
        }
        return string;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: clone */
    public final Transition mo73clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo73clone();
        transitionSet.f18003a = new ArrayList();
        int size = this.f18003a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Transition transitionMo73clone = ((Transition) this.f18003a.get(i7)).mo73clone();
            transitionSet.f18003a.add(transitionMo73clone);
            transitionMo73clone.mParent = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(int i7) {
        for (int i10 = 0; i10 < this.f18003a.size(); i10++) {
            ((Transition) this.f18003a.get(i10)).addTarget(i7);
        }
        return (TransitionSet) super.addTarget(i7);
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(String str, boolean z3) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).excludeTarget(str, z3);
        }
        return super.excludeTarget(str, z3);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(View view) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18003a = new ArrayList();
        this.f18004b = true;
        this.f18006d = false;
        this.f18007e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17954g);
        k(Y.a.c(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(String str) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(int i7, boolean z3) {
        for (int i10 = 0; i10 < this.f18003a.size(); i10++) {
            ((Transition) this.f18003a.get(i10)).excludeTarget(i7, z3);
        }
        return super.excludeTarget(i7, z3);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(Class cls) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).removeTarget((Class<?>) cls);
        }
        return (TransitionSet) super.removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    public final Transition addTarget(Class cls) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).addTarget((Class<?>) cls);
        }
        return (TransitionSet) super.addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    public final Transition excludeTarget(Class cls, boolean z3) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).excludeTarget((Class<?>) cls, z3);
        }
        return super.excludeTarget((Class<?>) cls, z3);
    }

    @Override // androidx.transition.Transition
    public final Transition removeTarget(String str) {
        for (int i7 = 0; i7 < this.f18003a.size(); i7++) {
            ((Transition) this.f18003a.get(i7)).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }
}
