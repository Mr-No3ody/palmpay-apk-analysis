package cn.tongdun.android.q999ggg99999qqggqqg9qg;

import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class qgq9qg99 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final String[] f19078q999ggg99999qqggqqg9qg;
    private static qqggggg9g9q99q9gq qgq9qg99;

    public interface q999ggg99999qqggqqg9qg {
        void q999ggg99999qqggqqg9qg(Map map);
    }

    /* JADX INFO: renamed from: cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99$qgq9qg99, reason: collision with other inner class name */
    public static class C0006qgq9qg99 extends SSLSocketFactory {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private SSLContext f19079q999ggg99999qqggqqg9qg;

        public C0006qgq9qg99(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
            try {
                SSLContext sSLContext = SSLContext.getInstance(q999ggg99999qqggqqg9qg("6d6067", 108));
                this.f19079q999ggg99999qqggqqg9qg = sSLContext;
                sSLContext.init(null, null, null);
            } catch (Exception unused) {
            }
        }

        private static String q999ggg99999qqggqqg9qg(String str, int i7) {
            try {
                int length = str.length() / 2;
                char[] charArray = str.toCharArray();
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 << 1;
                    bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
                }
                byte b7 = (byte) (bArr[0] ^ 57);
                bArr[0] = b7;
                for (int i12 = 1; i12 < length; i12++) {
                    b7 = (byte) ((b7 ^ bArr[i12]) ^ KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
                    bArr[i12] = b7;
                }
                return new String(bArr, Constants.ENCODING);
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i7) throws IOException {
            SSLSocket sSLSocket = (SSLSocket) this.f19079q999ggg99999qqggqqg9qg.getSocketFactory().createSocket(str, i7);
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9ggqqggqq99gqq9q99) {
                sSLSocket.setEnabledProtocols(qgq9qg99.f19078q999ggg99999qqggqqg9qg);
            }
            return sSLSocket;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getDefaultCipherSuites() {
            return this.f19079q999ggg99999qqggqqg9qg.getSocketFactory().getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getSupportedCipherSuites() {
            return this.f19079q999ggg99999qqggqqg9qg.getSocketFactory().getSupportedCipherSuites();
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i10) throws IOException {
            SSLSocket sSLSocket = (SSLSocket) this.f19079q999ggg99999qqggqqg9qg.getSocketFactory().createSocket(str, i7);
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9ggqqggqq99gqq9q99) {
                sSLSocket.setEnabledProtocols(qgq9qg99.f19078q999ggg99999qqggqqg9qg);
            }
            return sSLSocket;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i7) throws IOException {
            SSLSocket sSLSocket = (SSLSocket) this.f19079q999ggg99999qqggqqg9qg.getSocketFactory().createSocket(inetAddress, i7);
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9ggqqggqq99gqq9q99) {
                sSLSocket.setEnabledProtocols(qgq9qg99.f19078q999ggg99999qqggqqg9qg);
            }
            return sSLSocket;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i10) throws IOException {
            SSLSocket sSLSocket = (SSLSocket) this.f19079q999ggg99999qqggqqg9qg.getSocketFactory().createSocket(inetAddress, i7, inetAddress2, i10);
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9ggqqggqq99gqq9q99) {
                sSLSocket.setEnabledProtocols(qgq9qg99.f19078q999ggg99999qqggqqg9qg);
            }
            return sSLSocket;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final Socket createSocket(Socket socket, String str, int i7, boolean z3) throws IOException {
            SSLSocket sSLSocket = (SSLSocket) this.f19079q999ggg99999qqggqqg9qg.getSocketFactory().createSocket(socket, str, i7, z3);
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9ggqqggqq99gqq9q99) {
                sSLSocket.setEnabledProtocols(qgq9qg99.f19078q999ggg99999qqggqqg9qg);
            }
            return sSLSocket;
        }
    }

    static {
        q999ggg99999qqggqqg9qg("492f2812702828", 102);
        f19078q999ggg99999qqggqqg9qg = new String[]{q999ggg99999qqggqqg9qg("497b7c46247c7c", 50)};
        qgq9qg99 = new qqggggg9g9q99q9gq();
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 81);
            byte b10 = (byte) (bArr[0] ^ Ascii.GS);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String q999ggg99999qqggqqg9qg(String str, Map map, Map map2, byte[] bArr, int i7, q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() != null) {
                sb2.append((String) entry.getKey());
                sb2.append(q999ggg99999qqggqqg9qg("20", 67));
                sb2.append(URLEncoder.encode((String) entry.getValue(), q999ggg99999qqggqqg9qg("6871623b65", 33)));
                sb2.append(q999ggg99999qqggqqg9qg("3b", 97));
            }
        }
        if (!map2.isEmpty()) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        StringBuilder sbS = u.s(str);
        sbS.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_IN, 33));
        sbS.append(sb2.toString());
        return q999ggg99999qqggqqg9qg(new URL(sbS.toString()), map, bArr, q999ggg99999qqggqqg9qg("7c4d5c4059565e49415a5d1d1c504b4d4d05025b5a4b5850", 13), i7, q999ggg99999qqggqqg9qgVar);
    }

    private static String q999ggg99999qqggqqg9qg(URL url, Map map, byte[] bArr, String str, int i7, q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) throws Exception {
        HttpURLConnection httpURLConnection;
        HttpsURLConnection httpsURLConnection;
        if (q999ggg99999qqggqqg9qg("753d212522", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR).equals(url.getProtocol())) {
            httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqgq9qq9ggggg9g ? url.openConnection() : url.openConnection(Proxy.NO_PROXY)));
            if (i7 == 2) {
                httpsURLConnection.setHostnameVerifier(qgq9qg99);
            }
            httpURLConnection = httpsURLConnection;
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9ggqqggqq99gqq9q99) {
                httpsURLConnection.setSSLSocketFactory(new C0006qgq9qg99(null, null, null));
            }
        } else {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqgq9qq9ggggg9g ? url.openConnection() : url.openConnection(Proxy.NO_PROXY)));
        }
        if (httpURLConnection != null && map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnection = httpsURLConnection;
        httpURLConnection.setRequestProperty(q999ggg99999qqggqqg9qg("5e4b667d766c7d3e1e4a6e72", 54), str);
        httpURLConnection.setConnectTimeout(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9qqgq9q9);
        httpURLConnection.setReadTimeout(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9qqgq9q9);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod(q999ggg99999qqggqqg9qg("4d5d5e45", 19));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.flush();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            String str2 = q999ggg99999qqggqqg9qg("5e5875747f72632032737c717d753c78266362776b7569623137787f7531", 37) + responseCode;
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(str2);
            return str2;
        }
        if (q999ggg99999qqggqqg9qgVar != null) {
            try {
                q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(httpURLConnection.getHeaderFields());
            } catch (Exception unused) {
            }
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, q999ggg99999qqggqqg9qg("68382b722c", 104)));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                inputStream.close();
                outputStream.close();
                return sb2.toString();
            }
            sb2.append(line);
        }
    }
}
