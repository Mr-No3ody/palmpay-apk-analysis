package p012ad;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.github.chrisbanes.photoview.a;
import com.github.chrisbanes.photoview.b;
import com.transsnet.palmpay.photograph.crop.CropGestureDetector;
import com.transsnet.palmpay.photograph.crop.OnGestureListener;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements CropGestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f11888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f11889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f11893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f11894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f11895j;

    public e(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11891f = viewConfiguration.getScaledTouchSlop();
        this.f11892g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11886a = -1;
        this.f11887b = 0;
        this.f11888c = new ScaleGestureDetector(context, new d(this));
    }

    public void a(MotionEvent motionEvent) {
        float x3;
        float y8;
        float x7;
        float y10;
        float x10;
        float y11;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            b bVar = (b) this.f11895j;
            if (action == 1) {
                this.f11886a = -1;
                if (this.f11890e && this.f11889d != null) {
                    try {
                        x7 = motionEvent.getX(this.f11887b);
                    } catch (Exception unused) {
                        x7 = motionEvent.getX();
                    }
                    this.f11891f = x7;
                    try {
                        y10 = motionEvent.getY(this.f11887b);
                    } catch (Exception unused2) {
                        y10 = motionEvent.getY();
                    }
                    this.f11892g = y10;
                    this.f11889d.addMovement(motionEvent);
                    this.f11889d.computeCurrentVelocity(1000);
                    float xVelocity = this.f11889d.getXVelocity();
                    float yVelocity = this.f11889d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f11894i) {
                        bVar.onFling(this.f11891f, this.f11892g, -xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker = this.f11889d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f11889d = null;
                }
            } else if (action == 2) {
                try {
                    x10 = motionEvent.getX(this.f11887b);
                } catch (Exception unused3) {
                    x10 = motionEvent.getX();
                }
                try {
                    y11 = motionEvent.getY(this.f11887b);
                } catch (Exception unused4) {
                    y11 = motionEvent.getY();
                }
                float f10 = x10 - this.f11891f;
                float f11 = y11 - this.f11892g;
                if (!this.f11890e) {
                    this.f11890e = Math.sqrt((double) ((f11 * f11) + (f10 * f10))) >= ((double) this.f11893h);
                }
                if (this.f11890e) {
                    bVar.onDrag(f10, f11);
                    this.f11891f = x10;
                    this.f11892g = y11;
                    VelocityTracker velocityTracker2 = this.f11889d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f11886a = -1;
                VelocityTracker velocityTracker3 = this.f11889d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f11889d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f11886a) {
                    int i7 = action2 != 0 ? 0 : 1;
                    this.f11886a = motionEvent.getPointerId(i7);
                    this.f11891f = motionEvent.getX(i7);
                    this.f11892g = motionEvent.getY(i7);
                }
            }
        } else {
            this.f11886a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f11889d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x3 = motionEvent.getX(this.f11887b);
            } catch (Exception unused5) {
                x3 = motionEvent.getX();
            }
            this.f11891f = x3;
            try {
                y8 = motionEvent.getY(this.f11887b);
            } catch (Exception unused6) {
                y8 = motionEvent.getY();
            }
            this.f11892g = y8;
            this.f11890e = false;
        }
        int i10 = this.f11886a;
        this.f11887b = motionEvent.findPointerIndex(i10 != -1 ? i10 : 0);
    }

    @Override // com.transsnet.palmpay.photograph.crop.CropGestureDetector
    public boolean isDragging() {
        return this.f11890e;
    }

    @Override // com.transsnet.palmpay.photograph.crop.CropGestureDetector
    public boolean isScaling() {
        return this.f11888c.isInProgress();
    }

    @Override // com.transsnet.palmpay.photograph.crop.CropGestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x3;
        float y8;
        float x7;
        float y10;
        float x10;
        float y11;
        VelocityTracker velocityTracker;
        this.f11888c.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f11886a = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f11886a = -1;
        } else if (action == 6) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            if (motionEvent.getPointerId(action2) == this.f11886a) {
                int i7 = action2 == 0 ? 1 : 0;
                this.f11886a = motionEvent.getPointerId(i7);
                this.f11893h = motionEvent.getX(i7);
                this.f11894i = motionEvent.getY(i7);
            }
        }
        int i10 = this.f11886a;
        this.f11887b = motionEvent.findPointerIndex(i10 != -1 ? i10 : 0);
        int action3 = motionEvent.getAction();
        if (action3 == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f11889d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x3 = motionEvent.getX(this.f11887b);
            } catch (Exception unused) {
                x3 = motionEvent.getX();
            }
            this.f11893h = x3;
            try {
                y8 = motionEvent.getY(this.f11887b);
            } catch (Exception unused2) {
                y8 = motionEvent.getY();
            }
            this.f11894i = y8;
            this.f11890e = false;
        } else if (action3 == 1) {
            if (this.f11890e && this.f11889d != null) {
                try {
                    x7 = motionEvent.getX(this.f11887b);
                } catch (Exception unused3) {
                    x7 = motionEvent.getX();
                }
                this.f11893h = x7;
                try {
                    y10 = motionEvent.getY(this.f11887b);
                } catch (Exception unused4) {
                    y10 = motionEvent.getY();
                }
                this.f11894i = y10;
                this.f11889d.addMovement(motionEvent);
                this.f11889d.computeCurrentVelocity(1000);
                float xVelocity = this.f11889d.getXVelocity();
                float yVelocity = this.f11889d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f11892g) {
                    ((OnGestureListener) this.f11895j).onFling(this.f11893h, this.f11894i, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f11889d;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f11889d = null;
            }
        } else if (action3 == 2) {
            try {
                x10 = motionEvent.getX(this.f11887b);
            } catch (Exception unused5) {
                x10 = motionEvent.getX();
            }
            try {
                y11 = motionEvent.getY(this.f11887b);
            } catch (Exception unused6) {
                y11 = motionEvent.getY();
            }
            float f10 = x10 - this.f11893h;
            float f11 = y11 - this.f11894i;
            if (!this.f11890e) {
                this.f11890e = Math.sqrt((double) ((f11 * f11) + (f10 * f10))) >= ((double) this.f11891f);
            }
            if (this.f11890e) {
                ((OnGestureListener) this.f11895j).onDrag(f10, f11);
                this.f11893h = x10;
                this.f11894i = y11;
                VelocityTracker velocityTracker3 = this.f11889d;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action3 == 3 && (velocityTracker = this.f11889d) != null) {
            velocityTracker.recycle();
            this.f11889d = null;
        }
        return true;
    }

    @Override // com.transsnet.palmpay.photograph.crop.CropGestureDetector
    public void setOnGestureListener(OnGestureListener onGestureListener) {
        this.f11895j = onGestureListener;
    }

    public e(Context context, b bVar) {
        this.f11886a = -1;
        this.f11887b = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11894i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11893h = viewConfiguration.getScaledTouchSlop();
        this.f11895j = bVar;
        this.f11888c = new ScaleGestureDetector(context, new a(this));
    }
}
