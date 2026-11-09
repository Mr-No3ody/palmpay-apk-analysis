package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeAppearancePathProvider {
    protected static final int BOTTOM_LEFT_CORNER_INDEX = 2;
    protected static final int BOTTOM_RIGHT_CORNER_INDEX = 1;
    protected static final int TOP_LEFT_CORNER_INDEX = 3;
    protected static final int TOP_RIGHT_CORNER_INDEX = 0;
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    public static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    @RestrictTo({c.f39801b})
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i7);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i7);
    }

    public static final class ShapeAppearancePathSpec {

        @NonNull
        public final RectF bounds;
        public final float interpolation;

        @NonNull
        public final Path path;

        @Nullable
        public final PathListener pathListener;

        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        public ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, @Nullable PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f10;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i7 = 0; i7 < 4; i7++) {
            this.cornerPaths[i7] = new ShapePath();
            this.cornerTransforms[i7] = new Matrix();
            this.edgeTransforms[i7] = new Matrix();
        }
    }

    private float angleOfEdge(int i7) {
        return ((i7 + 1) % 4) * 90;
    }

    private void appendCornerPath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i7) {
        this.scratch[0] = this.cornerPaths[i7].getStartX();
        this.scratch[1] = this.cornerPaths[i7].getStartY();
        this.cornerTransforms[i7].mapPoints(this.scratch);
        if (i7 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i7].applyToPath(this.cornerTransforms[i7], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i7], this.cornerTransforms[i7], i7);
        }
    }

    private void appendEdgePath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i7) {
        int i10 = (i7 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i7].getEndX();
        this.scratch[1] = this.cornerPaths[i7].getEndY();
        this.cornerTransforms[i7].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i10].getStartX();
        this.scratch2[1] = this.cornerPaths[i10].getStartY();
        this.cornerTransforms[i10].mapPoints(this.scratch2);
        float[] fArr = this.scratch;
        float f10 = fArr[0];
        float[] fArr2 = this.scratch2;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i7);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i7, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(fMax, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i7], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i7) || pathOverlapsCorner(this.edgePath, i10))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i7].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr3 = this.scratch;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i7], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i7], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i7], i7);
        }
    }

    private void getCoordinatesOfCorner(int i7, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i7 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i7 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i7 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerTreatment getCornerTreatmentForIndex(int i7, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i7 == 1) {
            return shapeAppearanceModel.getBottomRightCorner();
        }
        if (i7 != 2) {
            return i7 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner();
        }
        return shapeAppearanceModel.getBottomLeftCorner();
    }

    private float getEdgeCenterForIndex(@NonNull RectF rectF, int i7) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i7];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i7].mapPoints(fArr);
        return (i7 == 1 || i7 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i7, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i7 == 1) {
            return shapeAppearanceModel.getBottomEdge();
        }
        if (i7 != 2) {
            return i7 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge();
        }
        return shapeAppearanceModel.getLeftEdge();
    }

    @NonNull
    @RestrictTo({c.f39801b})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int i7) {
        this.cornerPath.reset();
        this.cornerPaths[i7].applyToPath(this.cornerTransforms[i7], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void setCornerPathAndTransform(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i7, @Nullable float[] fArr) {
        getCornerTreatmentForIndex(i7, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i7], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, fArr == null ? getCornerSizeForIndex(i7, shapeAppearancePathSpec.shapeAppearanceModel) : new ClampedCornerSize(fArr[i7]));
        float fAngleOfEdge = angleOfEdge(i7);
        this.cornerTransforms[i7].reset();
        getCoordinatesOfCorner(i7, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i7];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i7].preRotate(fAngleOfEdge);
    }

    private void setEdgePathAndTransform(int i7) {
        this.scratch[0] = this.cornerPaths[i7].getEndX();
        this.scratch[1] = this.cornerPaths[i7].getEndY();
        this.cornerTransforms[i7].mapPoints(this.scratch);
        float fAngleOfEdge = angleOfEdge(i7);
        this.edgeTransforms[i7].reset();
        Matrix matrix = this.edgeTransforms[i7];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i7].preRotate(fAngleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f10, rectF, null, path);
    }

    @NonNull
    public CornerSize getCornerSizeForIndex(int i7, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i7 == 1) {
            return shapeAppearanceModel.getBottomRightCornerSize();
        }
        if (i7 != 2) {
            return i7 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomLeftCornerSize();
    }

    public void setEdgeIntersectionCheckEnable(boolean z3) {
        this.edgeIntersectionCheckEnabled = z3;
    }

    @RestrictTo({c.f39801b})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, PathListener pathListener, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, null, f10, rectF, pathListener, path);
    }

    @RestrictTo({c.f39801b})
    public void calculatePath(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr, float f10, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f10, rectF, pathListener, path);
        for (int i7 = 0; i7 < 4; i7++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i7, fArr);
            setEdgePathAndTransform(i7);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            appendCornerPath(shapeAppearancePathSpec, i10);
            appendEdgePath(shapeAppearancePathSpec, i10);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
