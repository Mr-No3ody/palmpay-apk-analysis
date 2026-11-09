package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes3.dex */
public final class GeoParsedResult extends ParsedResult {
    private final double altitude;
    private final double latitude;
    private final double longitude;
    private final String query;

    public GeoParsedResult(double d2, double d10, double d11, String str) {
        super(ParsedResultType.GEO);
        this.latitude = d2;
        this.longitude = d10;
        this.altitude = d11;
        this.query = str;
    }

    public double getAltitude() {
        return this.altitude;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(this.latitude);
        sb2.append(", ");
        sb2.append(this.longitude);
        if (this.altitude > 0.0d) {
            sb2.append(", ");
            sb2.append(this.altitude);
            sb2.append('m');
        }
        if (this.query != null) {
            sb2.append(" (");
            sb2.append(this.query);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public String getGeoURI() {
        StringBuilder sb2 = new StringBuilder("geo:");
        sb2.append(this.latitude);
        sb2.append(',');
        sb2.append(this.longitude);
        if (this.altitude > 0.0d) {
            sb2.append(',');
            sb2.append(this.altitude);
        }
        if (this.query != null) {
            sb2.append('?');
            sb2.append(this.query);
        }
        return sb2.toString();
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getQuery() {
        return this.query;
    }
}
