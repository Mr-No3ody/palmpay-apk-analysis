package com.google.maps.android.heatmaps;

import M.j;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private Bounds mBounds;
    private int[] mColorMap;
    private double mCustomMaxIntensity;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private PointQuadTree<WeightedLatLng> mTree;

    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 20;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.7d;
        private double intensity = 0.0d;

        public HeatmapTileProvider build() {
            if (this.data != null) {
                return new HeatmapTileProvider(this, 0);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder maxIntensity(double d2) {
            this.intensity = d2;
            return this;
        }

        public Builder opacity(double d2) {
            this.opacity = d2;
            if (d2 < 0.0d || d2 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public Builder radius(int i7) {
            this.radius = i7;
            if (i7 < 10 || i7 > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, JfifUtil.MARKER_APP1, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    public /* synthetic */ HeatmapTileProvider(Builder builder, int i7) {
        this(builder);
    }

    public static Bitmap colorize(double[][] dArr, int[] iArr, double d2) {
        int i7 = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d2;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i10 = 0; i10 < length2; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                double d10 = dArr[i11][i10];
                int i12 = (i10 * length2) + i11;
                int i13 = (int) (d10 * length);
                if (d10 == 0.0d) {
                    iArr2[i12] = 0;
                } else if (i13 < iArr.length) {
                    iArr2[i12] = iArr[i13];
                } else {
                    iArr2[i12] = i7;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    private static Tile convertBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    public static double[][] convolve(double[][] dArr, double[] dArr2) {
        int iFloor = (int) Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i7 = length - (iFloor * 2);
        int i10 = iFloor + i7;
        int i11 = i10 - 1;
        boolean z3 = true;
        int i12 = 0;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, length, length);
        int i13 = 0;
        while (true) {
            double d2 = 0.0d;
            if (i13 >= length) {
                break;
            }
            int i14 = i12;
            while (i14 < length) {
                double d10 = dArr[i13][i14];
                if (d10 != d2) {
                    int i15 = i13 + iFloor;
                    if (i11 < i15) {
                        i15 = i11;
                    }
                    int i16 = i15 + 1;
                    int i17 = i13 - iFloor;
                    for (int i18 = iFloor > i17 ? iFloor : i17; i18 < i16; i18++) {
                        double[] dArr4 = dArr3[i18];
                        dArr4[i14] = (dArr2[i18 - i17] * d10) + dArr4[i14];
                    }
                }
                i14++;
                z3 = z3;
                i12 = i12;
                d2 = d2;
            }
            i13++;
        }
        int i19 = i12;
        int[] iArr = new int[2];
        iArr[z3 ? 1 : 0] = i7;
        iArr[i19] = i7;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i20 = iFloor; i20 < i10; i20++) {
            for (int i21 = i19; i21 < length; i21++) {
                double d11 = dArr3[i20][i21];
                if (d11 != 0.0d) {
                    int i22 = i21 + iFloor;
                    if (i11 < i22) {
                        i22 = i11;
                    }
                    int i23 = i22 + 1;
                    int i24 = i21 - iFloor;
                    for (int i25 = iFloor > i24 ? iFloor : i24; i25 < i23; i25++) {
                        double[] dArr6 = dArr5[i20 - iFloor];
                        int i26 = i25 - iFloor;
                        dArr6[i26] = (dArr2[i25 - i24] * d11) + dArr6[i26];
                    }
                }
            }
        }
        return dArr5;
    }

    public static double[] generateKernel(int i7, double d2) {
        double[] dArr = new double[(i7 * 2) + 1];
        for (int i10 = -i7; i10 <= i7; i10++) {
            dArr[i10 + i7] = Math.exp(((double) ((-i10) * i10)) / ((2.0d * d2) * d2));
        }
        return dArr;
    }

    public static Bounds getBounds(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d2 = next.getPoint().f23092x;
        double d10 = next.getPoint().f23092x;
        double d11 = d2;
        double d12 = d10;
        double d13 = next.getPoint().f23093y;
        double d14 = next.getPoint().f23093y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d15 = next2.getPoint().f23092x;
            double d16 = next2.getPoint().f23093y;
            if (d15 < d11) {
                d11 = d15;
            }
            if (d15 > d12) {
                d12 = d15;
            }
            if (d16 < d13) {
                d13 = d16;
            }
            if (d16 > d14) {
                d14 = d16;
            }
        }
        return new Bounds(d11, d12, d13, d14);
    }

    private double[] getMaxIntensities(int i7) {
        int i10;
        double[] dArr = new double[22];
        if (this.mCustomMaxIntensity != 0.0d) {
            for (int i11 = 0; i11 < 22; i11++) {
                dArr[i11] = this.mCustomMaxIntensity;
            }
        } else {
            int i12 = 5;
            while (true) {
                if (i12 >= 11) {
                    break;
                }
                dArr[i12] = getMaxValue(this.mData, this.mBounds, i7, (int) (Math.pow(2.0d, i12 - 3) * 1280.0d));
                if (i12 == 5) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        dArr[i13] = dArr[i12];
                    }
                }
                i12++;
            }
            for (i10 = 11; i10 < 22; i10++) {
                dArr[i10] = dArr[10];
            }
        }
        return dArr;
    }

    public static double getMaxValue(Collection<WeightedLatLng> collection, Bounds bounds, int i7, int i10) {
        double d2 = bounds.minX;
        double d10 = bounds.maxX;
        double d11 = bounds.minY;
        double d12 = d10 - d2;
        double d13 = bounds.maxY - d11;
        if (d12 <= d13) {
            d12 = d13;
        }
        double d14 = ((double) ((int) (((double) (i10 / (i7 * 2))) + 0.5d))) / d12;
        j jVar = new j();
        double d15 = 0.0d;
        for (WeightedLatLng weightedLatLng : collection) {
            double d16 = weightedLatLng.getPoint().f23092x;
            int i11 = (int) ((weightedLatLng.getPoint().f23093y - d11) * d14);
            long j6 = (int) ((d16 - d2) * d14);
            j jVar2 = (j) jVar.b(j6);
            if (jVar2 == null) {
                jVar2 = new j();
                jVar.e(j6, jVar2);
            }
            long j10 = i11;
            Double dValueOf = (Double) jVar2.b(j10);
            if (dValueOf == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            double intensity = weightedLatLng.getIntensity() + dValueOf.doubleValue();
            jVar2.e(j10, Double.valueOf(intensity));
            if (intensity > d15) {
                d15 = intensity;
            }
        }
        return d15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i7, int i10, int i11) {
        double d2 = 1.0d;
        double dPow = 1.0d / Math.pow(2.0d, i11);
        int i12 = this.mRadius;
        double d10 = (((double) i12) * dPow) / 512.0d;
        double d11 = ((2.0d * d10) + dPow) / ((double) ((i12 * 2) + 512));
        double d12 = (((double) i7) * dPow) - d10;
        double d13 = (((double) (i7 + 1)) * dPow) + d10;
        double d14 = (((double) i10) * dPow) - d10;
        double d15 = (((double) (i10 + 1)) * dPow) + d10;
        Collection<WeightedLatLng> arrayList = new ArrayList();
        if (d12 < 0.0d) {
            arrayList = this.mTree.search(new Bounds(d12 + 1.0d, 1.0d, d14, d15));
            d2 = -1.0d;
        } else if (d13 > 1.0d) {
            arrayList = this.mTree.search(new Bounds(0.0d, d13 - 1.0d, d14, d15));
        } else {
            d2 = 0.0d;
        }
        Bounds bounds = new Bounds(d12, d13, d14, d15);
        Bounds bounds2 = this.mBounds;
        if (!bounds.intersects(new Bounds(bounds2.minX - d10, bounds2.maxX + d10, bounds2.minY - d10, bounds2.maxY + d10))) {
            return TileProvider.NO_TILE;
        }
        Collection<T> collectionSearch = this.mTree.search(bounds);
        if (collectionSearch.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i13 = this.mRadius;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i13 * 2) + 512, (i13 * 2) + 512);
        for (T t : collectionSearch) {
            Point point = t.getPoint();
            int i14 = (int) ((point.f23092x - d12) / d11);
            int i15 = (int) ((point.f23093y - d14) / d11);
            double[] dArr2 = dArr[i14];
            dArr2[i15] = t.getIntensity() + dArr2[i15];
        }
        for (WeightedLatLng weightedLatLng : arrayList) {
            Point point2 = weightedLatLng.getPoint();
            int i16 = (int) (((point2.f23092x + d2) - d12) / d11);
            int i17 = (int) ((point2.f23093y - d14) / d11);
            double[] dArr3 = dArr[i16];
            dArr3[i17] = weightedLatLng.getIntensity() + dArr3[i17];
        }
        return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i11]));
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(wrapData(collection));
    }

    public void setGradient(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setMaxIntensity(double d2) {
        this.mCustomMaxIntensity = d2;
        setWeightedData(this.mData);
    }

    public void setOpacity(double d2) {
        this.mOpacity = d2;
        setGradient(this.mGradient);
    }

    public void setRadius(int i7) {
        this.mRadius = i7;
        this.mKernel = generateKernel(i7, ((double) i7) / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.mData = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        Bounds bounds = getBounds(this.mData);
        this.mBounds = bounds;
        this.mTree = new PointQuadTree<>(bounds);
        Iterator<WeightedLatLng> it = this.mData.iterator();
        while (it.hasNext()) {
            this.mTree.add(it.next());
        }
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        this.mCustomMaxIntensity = builder.intensity;
        int i7 = this.mRadius;
        this.mKernel = generateKernel(i7, ((double) i7) / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }
}
