package com.google.common.net;

import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class InetAddresses {
    private static final int IPV4_PART_COUNT = 4;
    private static final int IPV6_PART_COUNT = 8;
    private static final char IPV4_DELIMITER = '.';
    private static final CharMatcher IPV4_DELIMITER_MATCHER = CharMatcher.is(IPV4_DELIMITER);
    private static final char IPV6_DELIMITER = ':';
    private static final CharMatcher IPV6_DELIMITER_MATCHER = CharMatcher.is(IPV6_DELIMITER);
    private static final Inet4Address LOOPBACK4 = (Inet4Address) forString("127.0.0.1");
    private static final Inet4Address ANY4 = (Inet4Address) forString("0.0.0.0");

    public static final class TeredoInfo {
        private final Inet4Address client;
        private final int flags;
        private final int port;
        private final Inet4Address server;

        public TeredoInfo(@CheckForNull Inet4Address inet4Address, @CheckForNull Inet4Address inet4Address2, int i7, int i10) {
            boolean z3 = false;
            Preconditions.checkArgument(i7 >= 0 && i7 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", i7);
            if (i10 >= 0 && i10 <= 65535) {
                z3 = true;
            }
            Preconditions.checkArgument(z3, "flags '%s' is out of range (0 <= flags <= 0xffff)", i10);
            this.server = (Inet4Address) MoreObjects.firstNonNull(inet4Address, InetAddresses.ANY4);
            this.client = (Inet4Address) MoreObjects.firstNonNull(inet4Address2, InetAddresses.ANY4);
            this.port = i7;
            this.flags = i10;
        }

        public Inet4Address getClient() {
            return this.client;
        }

        public int getFlags() {
            return this.flags;
        }

        public int getPort() {
            return this.port;
        }

        public Inet4Address getServer() {
            return this.server;
        }
    }

    private InetAddresses() {
    }

    private static InetAddress bytesToInetAddress(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new AssertionError(e10);
        }
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    private static void compressLongestRunOfZeroes(int[] iArr) {
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < iArr.length + 1; i12++) {
            if (i12 >= iArr.length || iArr[i12] != 0) {
                if (i11 >= 0) {
                    int i13 = i12 - i11;
                    if (i13 > i7) {
                        i10 = i11;
                        i7 = i13;
                    }
                    i11 = -1;
                }
            } else if (i11 < 0) {
                i11 = i12;
            }
        }
        if (i7 >= 2) {
            Arrays.fill(iArr, i10, i7 + i10, -1);
        }
    }

    @CheckForNull
    private static String convertDottedQuadToHex(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrTextToNumericFormatV4 = textToNumericFormatV4(str.substring(iLastIndexOf));
        if (bArrTextToNumericFormatV4 == null) {
            return null;
        }
        String hexString = Integer.toHexString(((bArrTextToNumericFormatV4[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArrTextToNumericFormatV4[1] & UnsignedBytes.MAX_VALUE));
        String hexString2 = Integer.toHexString((bArrTextToNumericFormatV4[3] & UnsignedBytes.MAX_VALUE) | ((bArrTextToNumericFormatV4[2] & UnsignedBytes.MAX_VALUE) << 8));
        return d.k(strSubstring, d.c(d.c(d.c(1, strSubstring), hexString), hexString2), hexString, ":", hexString2);
    }

    public static InetAddress decrement(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return bytesToInetAddress(address);
    }

    @CanIgnoreReturnValue
    public static InetAddress forString(String str) {
        byte[] bArrIpStringToBytes = ipStringToBytes(str);
        if (bArrIpStringToBytes != null) {
            return bytesToInetAddress(bArrIpStringToBytes);
        }
        throw formatIllegalArgumentException("'%s' is not an IP string literal.", str);
    }

    public static InetAddress forUriString(String str) {
        InetAddress inetAddressForUriStringNoThrow = forUriStringNoThrow(str);
        if (inetAddressForUriStringNoThrow != null) {
            return inetAddressForUriStringNoThrow;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", str);
    }

    @CheckForNull
    private static InetAddress forUriStringNoThrow(String str) {
        int i7;
        Preconditions.checkNotNull(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = u.f(1, 1, str);
            i7 = 16;
        } else {
            i7 = 4;
        }
        byte[] bArrIpStringToBytes = ipStringToBytes(str);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != i7) {
            return null;
        }
        return bytesToInetAddress(bArrIpStringToBytes);
    }

    private static IllegalArgumentException formatIllegalArgumentException(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static InetAddress fromBigInteger(BigInteger bigInteger, boolean z3) {
        Preconditions.checkArgument(bigInteger.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i7 = z3 ? 16 : 4;
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i7];
        int iMax = Math.max(0, byteArray.length - i7);
        int length = byteArray.length - iMax;
        int i10 = i7 - length;
        for (int i11 = 0; i11 < iMax; i11++) {
            if (byteArray[i11] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i7), bigInteger);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i10, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new AssertionError(e10);
        }
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
        return (Inet4Address) fromBigInteger(bigInteger, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
        return (Inet6Address) fromBigInteger(bigInteger, true);
    }

    public static Inet4Address fromInteger(int i7) {
        return getInet4Address(Ints.toByteArray(i7));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = bArr[(bArr.length - i7) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
        boolean z3;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i7 = 0;
        while (true) {
            if (i7 >= 15) {
                z3 = true;
                break;
            }
            if (address[i7] != 0) {
                z3 = false;
                break;
            }
            i7++;
        }
        if (z3 && address[15] == 1) {
            return LOOPBACK4;
        }
        if (z3 && address[15] == 0) {
            return ANY4;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        int iAsInt = Hashing.murmur3_32_fixed().hashLong(hasEmbeddedIPv4ClientAddress(inet6Address) ? getEmbeddedIPv4ClientAddress(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).asInt() | (-536870912);
        if (iAsInt == -1) {
            iAsInt = -2;
        }
        return getInet4Address(Ints.toByteArray(iAsInt));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(inet6Address));
    }

    private static Inet4Address getInet4Address(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) bytesToInetAddress(bArr);
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
        Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", toAddrString(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address inet4Address = getInet4Address(Arrays.copyOfRange(address, 4, 8));
        int i7 = ByteStreams.newDataInput(address, 8).readShort() & 65535;
        int i10 = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i11 = 0; i11 < bArrCopyOfRange.length; i11++) {
            bArrCopyOfRange[i11] = (byte) (~bArrCopyOfRange[i11]);
        }
        return new TeredoInfo(inet4Address, getInet4Address(bArrCopyOfRange), i10, i7);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        return isCompatIPv4Address(inet6Address) || is6to4Address(inet6Address) || isTeredoAddress(inet6Address);
    }

    private static String hextetsToIPv6String(int[] iArr) {
        StringBuilder sb2 = new StringBuilder(39);
        int i7 = 0;
        boolean z3 = false;
        while (i7 < iArr.length) {
            boolean z8 = iArr[i7] >= 0;
            if (z8) {
                if (z3) {
                    sb2.append(IPV6_DELIMITER);
                }
                sb2.append(Integer.toHexString(iArr[i7]));
            } else if (i7 == 0 || z3) {
                sb2.append("::");
            }
            i7++;
            z3 = z8;
        }
        return sb2.toString();
    }

    public static InetAddress increment(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return bytesToInetAddress(address);
    }

    @CheckForNull
    private static byte[] ipStringToBytes(String str) {
        int i7 = 0;
        boolean z3 = false;
        boolean z8 = false;
        while (true) {
            if (i7 >= str.length()) {
                i7 = -1;
                break;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt == '.') {
                z3 = true;
            } else if (cCharAt == ':') {
                if (z3) {
                    return null;
                }
                z8 = true;
            } else {
                if (cCharAt == '%') {
                    break;
                }
                if (Character.digit(cCharAt, 16) == -1) {
                    return null;
                }
            }
            i7++;
        }
        if (!z8) {
            if (z3 && i7 == -1) {
                return textToNumericFormatV4(str);
            }
            return null;
        }
        if (z3 && (str = convertDottedQuadToHex(str)) == null) {
            return null;
        }
        if (i7 != -1) {
            str = str.substring(0, i7);
        }
        return textToNumericFormatV6(str);
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
        byte b7;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b7 = address[15]) == 0 || b7 == 1)) ? false : true;
    }

    public static boolean isInetAddress(String str) {
        return ipStringToBytes(str) != null;
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean isMappedIPv4Address(String str) {
        byte[] bArrIpStringToBytes = ipStringToBytes(str);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != 16) {
            return false;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= 10) {
                for (int i10 = 10; i10 < 12; i10++) {
                    if (bArrIpStringToBytes[i10] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrIpStringToBytes[i7] != 0) {
                return false;
            }
            i7++;
        }
    }

    public static boolean isMaximum(InetAddress inetAddress) {
        for (byte b7 : inetAddress.getAddress()) {
            if (b7 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean isUriInetAddress(String str) {
        return forUriStringNoThrow(str) != null;
    }

    private static short parseHextet(String str, int i7, int i10) {
        int i11 = i10 - i7;
        if (i11 <= 0 || i11 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (i7 < i10) {
            iDigit = (iDigit << 4) | Character.digit(str.charAt(i7), 16);
            i7++;
        }
        return (short) iDigit;
    }

    private static byte parseOctet(String str, int i7, int i10) {
        int i11 = i10 - i7;
        if (i11 <= 0 || i11 > 3) {
            throw new NumberFormatException();
        }
        if (i11 > 1 && str.charAt(i7) == '0') {
            throw new NumberFormatException();
        }
        int i12 = 0;
        while (i7 < i10) {
            int i13 = i12 * 10;
            int iDigit = Character.digit(str.charAt(i7), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i12 = i13 + iDigit;
            i7++;
        }
        if (i12 <= 255) {
            return (byte) i12;
        }
        throw new NumberFormatException();
    }

    @CheckForNull
    private static byte[] textToNumericFormatV4(String str) {
        if (IPV4_DELIMITER_MATCHER.countIn(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int iIndexOf = str.indexOf(46, i7);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i10] = parseOctet(str, i7, iIndexOf);
                i7 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @CheckForNull
    private static byte[] textToNumericFormatV6(String str) {
        int iCountIn = IPV6_DELIMITER_MATCHER.countIn(str);
        if (iCountIn >= 2 && iCountIn <= 8) {
            int i7 = 1;
            int i10 = iCountIn + 1;
            int i11 = 8 - i10;
            boolean z3 = false;
            for (int i12 = 0; i12 < str.length() - 1; i12++) {
                if (str.charAt(i12) == ':' && str.charAt(i12 + 1) == ':') {
                    if (z3) {
                        return null;
                    }
                    int i13 = i11 + 1;
                    if (i12 == 0) {
                        i13 = i11 + 2;
                    }
                    if (i12 == str.length() - 2) {
                        i13++;
                    }
                    i11 = i13;
                    z3 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z3 && i11 <= 0) {
                return null;
            }
            if (!z3 && i10 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i7 = 0;
                }
                while (i7 < str.length()) {
                    int iIndexOf = str.indexOf(58, i7);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    if (str.charAt(i7) == ':') {
                        for (int i14 = 0; i14 < i11; i14++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(parseHextet(str, i7, iIndexOf));
                    }
                    i7 = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String toAddrString(InetAddress inetAddress) {
        Preconditions.checkNotNull(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        Preconditions.checkArgument(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = i7 * 2;
            iArr[i7] = Ints.fromBytes((byte) 0, (byte) 0, address[i10], address[i10 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        return hextetsToIPv6String(iArr);
    }

    public static BigInteger toBigInteger(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String toUriString(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return toAddrString(inetAddress);
        }
        String addrString = toAddrString(inetAddress);
        return d.i(d.c(2, addrString), "[", addrString, "]");
    }
}
