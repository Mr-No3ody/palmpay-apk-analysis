package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes3.dex */
public class FilterRegion {
    C1420q mH;
    C1420q mW;
    C1420q mX;
    C1420q mY;

    private double getRelativeOrDefault(VirtualView virtualView, C1420q c1420q, float f10, double d2) {
        return (c1420q == null || c1420q.f23544b == SVGLength$UnitType.UNKNOWN) ? d2 : virtualView.relativeOn(c1420q, f10);
    }

    public Rect getCropRect(VirtualView virtualView, EnumC1410g enumC1410g, RectF rectF) {
        double dRelativeOnFraction;
        double relativeOrDefault;
        double dRelativeOnFraction2;
        double dRelativeOnFraction3;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (enumC1410g == EnumC1410g.OBJECT_BOUNDING_BOX) {
            dRelativeOnFraction = virtualView.relativeOnFraction(this.mX, rectF.width()) + ((double) rectF.left);
            dRelativeOnFraction3 = virtualView.relativeOnFraction(this.mY, rectF.height()) + ((double) rectF.top);
            dRelativeOnFraction2 = virtualView.relativeOnFraction(this.mW, rectF.width());
            relativeOrDefault = virtualView.relativeOnFraction(this.mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault2 = getRelativeOrDefault(virtualView, this.mX, canvasWidth, rectF.left);
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.mY, canvasHeight, rectF.top);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.mW, canvasWidth, rectF.width());
            dRelativeOnFraction = relativeOrDefault2;
            relativeOrDefault = getRelativeOrDefault(virtualView, this.mH, canvasHeight, rectF.height());
            dRelativeOnFraction2 = relativeOrDefault4;
            dRelativeOnFraction3 = relativeOrDefault3;
        }
        return new Rect((int) dRelativeOnFraction, (int) dRelativeOnFraction3, (int) (dRelativeOnFraction + dRelativeOnFraction2), (int) (dRelativeOnFraction3 + relativeOrDefault));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = C1420q.b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = C1420q.b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = C1420q.b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = C1420q.b(dynamic);
    }
}
