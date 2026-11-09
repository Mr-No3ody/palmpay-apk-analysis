package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<ShadowCompatOperation> shadowCompatOperations = new ArrayList();

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    public static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i7, @NonNull Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom()), i7, this.operation.getStartAngle(), this.operation.getSweepAngle());
        }
    }

    public static class InnerCornerShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation1;
        private final PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f10, float f11) {
            this.operation1 = pathLineOperation;
            this.operation2 = pathLineOperation2;
            this.startX = f10;
            this.startY = f11;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i7, Canvas canvas) {
            int i10;
            float sweepAngle = getSweepAngle();
            if (sweepAngle > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.operation1.f22568x - this.startX, this.operation1.f22569y - this.startY);
            double dHypot2 = Math.hypot(this.operation2.f22568x - this.operation1.f22568x, this.operation2.f22569y - this.operation1.f22569y);
            float fMin = (float) Math.min(i7, Math.min(dHypot, dHypot2));
            double d2 = fMin;
            double dTan = Math.tan(Math.toRadians((-sweepAngle) / 2.0f)) * d2;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.startX, this.startY);
                this.renderMatrix.preRotate(getStartAngle());
                i10 = i7;
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i10);
            } else {
                i10 = i7;
            }
            float f10 = fMin * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f10, f10);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.operation1.f22568x, this.operation1.f22569y);
            this.renderMatrix.preRotate(getStartAngle());
            this.renderMatrix.preTranslate((float) ((-dTan) - d2), (-2.0f) * fMin);
            shadowRenderer.drawInnerCornerShadow(canvas, this.renderMatrix, rectF2, (int) fMin, 450.0f, sweepAngle, new float[]{(float) (d2 + dTan), f10});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.operation1.f22568x, this.operation1.f22569y);
                this.renderMatrix.preRotate(getEndAngle());
                this.renderMatrix.preTranslate((float) dTan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF3, i10);
            }
        }

        public float getEndAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation2.f22569y - this.operation1.f22569y) / (this.operation2.f22568x - this.operation1.f22568x)));
        }

        public float getStartAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation1.f22569y - this.startY) / (this.operation1.f22568x - this.startX)));
        }

        public float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            return endAngle <= 180.0f ? endAngle : endAngle - 360.0f;
        }
    }

    public static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f10, float f11) {
            this.operation = pathLineOperation;
            this.startX = f10;
            this.startY = f11;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i7, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.operation.f22569y - this.startY, this.operation.f22568x - this.startX), 0.0f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.startX, this.startY);
            this.renderMatrix.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i7);
        }

        public float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation.f22569y - this.startY) / (this.operation.f22568x - this.startX)));
        }
    }

    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        /* JADX INFO: renamed from: top, reason: collision with root package name */
        @Deprecated
        public float f22567top;

        public PathArcOperation(float f10, float f11, float f12, float f13) {
            setLeft(f10);
            setTop(f11);
            setRight(f12);
            setBottom(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.f22567top;
        }

        private void setBottom(float f10) {
            this.bottom = f10;
        }

        private void setLeft(float f10) {
            this.left = f10;
        }

        private void setRight(float f10) {
            this.right = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f10) {
            this.startAngle = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f10) {
            this.sweepAngle = f10;
        }

        private void setTop(float f10) {
            this.f22567top = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f10, float f11, float f12, float f13, float f14, float f15) {
            setControlX1(f10);
            setControlY1(f11);
            setControlX2(f12);
            setControlY2(f13);
            setEndX(f14);
            setEndY(f15);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setControlX1(float f10) {
            this.controlX1 = f10;
        }

        private void setControlX2(float f10) {
            this.controlX2 = f10;
        }

        private void setControlY1(float f10) {
            this.controlY1 = f10;
        }

        private void setControlY2(float f10) {
            this.controlY2 = f10;
        }

        private void setEndX(float f10) {
            this.endX = f10;
        }

        private void setEndY(float f10) {
            this.endY = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f22568x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f22569y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f22568x, this.f22569y);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float getControlX() {
            return this.controlX;
        }

        private float getControlY() {
            return this.controlY;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f10) {
            this.controlX = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f10) {
            this.controlY = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f10) {
            this.endX = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f10) {
            this.endY = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    public static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = new Matrix();
        final Matrix renderMatrix = new Matrix();

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i7, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i7, Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i7, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f10) {
        if (getCurrentShadowAngle() == f10) {
            return;
        }
        float currentShadowAngle = ((f10 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > 180.0f) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
        pathArcOperation.setStartAngle(getCurrentShadowAngle());
        pathArcOperation.setSweepAngle(currentShadowAngle);
        this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
        setCurrentShadowAngle(f10);
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f10, float f11) {
        addConnectingShadowIfNecessary(f10);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f11);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f10) {
        this.currentShadowAngle = f10;
    }

    private void setEndShadowAngle(float f10) {
        this.endShadowAngle = f10;
    }

    private void setEndX(float f10) {
        this.endX = f10;
    }

    private void setEndY(float f10) {
        this.endY = f10;
    }

    private void setStartX(float f10) {
        this.startX = f10;
    }

    private void setStartY(float f10) {
        this.startY = f10;
    }

    public void addArc(float f10, float f11, float f12, float f13, float f14, float f15) {
        PathArcOperation pathArcOperation = new PathArcOperation(f10, f11, f12, f13);
        pathArcOperation.setStartAngle(f14);
        pathArcOperation.setSweepAngle(f15);
        this.operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f16 = f14 + f15;
        boolean z3 = f15 < 0.0f;
        if (z3) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        addShadowCompatOperation(arcShadowOperation, f14, z3 ? (180.0f + f16) % 360.0f : f16);
        double d2 = f16;
        setEndX((((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f10 + f12) * 0.5f));
        setEndY((((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f11 + f13) * 0.5f));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.operations.get(i7).applyToPath(matrix, path);
        }
    }

    public boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    @NonNull
    public ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.shadowCompatOperations);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i7, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i7, canvas);
                }
            }
        };
    }

    public void cubicToPoint(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.operations.add(new PathCubicOperation(f10, f11, f12, f13, f14, f15));
        this.containsIncompatibleShadowOp = true;
        setEndX(f14);
        setEndY(f15);
    }

    public float getEndX() {
        return this.endX;
    }

    public float getEndY() {
        return this.endY;
    }

    public float getStartX() {
        return this.startX;
    }

    public float getStartY() {
        return this.startY;
    }

    public void lineTo(float f10, float f11) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f22568x = f10;
        pathLineOperation.f22569y = f11;
        this.operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + 270.0f, lineShadowOperation.getAngle() + 270.0f);
        setEndX(f10);
        setEndY(f11);
    }

    public void quadToPoint(float f10, float f11, float f12, float f13) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f10);
        pathQuadOperation.setControlY(f11);
        pathQuadOperation.setEndX(f12);
        pathQuadOperation.setEndY(f13);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f12);
        setEndY(f13);
    }

    public void reset(float f10, float f11) {
        reset(f10, f11, 270.0f, 0.0f);
    }

    public void reset(float f10, float f11, float f12, float f13) {
        setStartX(f10);
        setStartY(f11);
        setEndX(f10);
        setEndY(f11);
        setCurrentShadowAngle(f12);
        setEndShadowAngle((f12 + f13) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public ShapePath(float f10, float f11) {
        reset(f10, f11);
    }

    public void lineTo(float f10, float f11, float f12, float f13) {
        if ((Math.abs(f10 - getEndX()) < 0.001f && Math.abs(f11 - getEndY()) < 0.001f) || (Math.abs(f10 - f12) < 0.001f && Math.abs(f11 - f13) < 0.001f)) {
            lineTo(f12, f13);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f22568x = f10;
        pathLineOperation.f22569y = f11;
        this.operations.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f22568x = f12;
        pathLineOperation2.f22569y = f13;
        this.operations.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (innerCornerShadowOperation.getSweepAngle() > 0.0f) {
            lineTo(f10, f11);
            lineTo(f12, f13);
        } else {
            addShadowCompatOperation(innerCornerShadowOperation, innerCornerShadowOperation.getStartAngle() + 270.0f, innerCornerShadowOperation.getEndAngle() + 270.0f);
            setEndX(f12);
            setEndY(f13);
        }
    }
}
