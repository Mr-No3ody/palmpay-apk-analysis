package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String str, int i7, boolean z3) {
        this.host = str;
        this.port = i7;
        this.hasBracketlessColons = z3;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return hostAndPortFromString;
    }

    public static HostAndPort fromParts(String str, int i7) {
        Preconditions.checkArgument(isValidPort(i7), "Port out of range: %s", i7);
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(hostAndPortFromString.host, i7, hostAndPortFromString.hasBracketlessColons);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    @CanIgnoreReturnValue
    public static HostAndPort fromString(String str) {
        boolean z3;
        String strSubstring;
        String str2;
        String strSubstring2;
        Preconditions.checkNotNull(str);
        int i7 = -1;
        if (!str.startsWith("[")) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                int i10 = iIndexOf + 1;
                if (str.indexOf(58, i10) == -1) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(i10);
                }
                if (!Strings.isNullOrEmpty(strSubstring)) {
                    Preconditions.checkArgument(strSubstring.startsWith("+") && CharMatcher.ascii().matchesAllOf(strSubstring), "Unparseable port number: %s", str);
                    try {
                        i7 = Integer.parseInt(strSubstring);
                        Preconditions.checkArgument(isValidPort(i7), "Port number out of range: %s", str);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(str.length() != 0 ? "Unparseable port number: ".concat(str) : new String("Unparseable port number: "));
                    }
                }
                return new HostAndPort(str2, i7, z3);
            }
            z3 = iIndexOf >= 0;
            strSubstring = null;
            str2 = str;
            if (!Strings.isNullOrEmpty(strSubstring)) {
                Preconditions.checkArgument(strSubstring.startsWith("+") && CharMatcher.ascii().matchesAllOf(strSubstring), "Unparseable port number: %s", str);
                i7 = Integer.parseInt(strSubstring);
                Preconditions.checkArgument(isValidPort(i7), "Port number out of range: %s", str);
            }
            return new HostAndPort(str2, i7, z3);
        }
        String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(str);
        strSubstring2 = hostAndPortFromBracketedHost[0];
        strSubstring = hostAndPortFromBracketedHost[1];
        str2 = strSubstring2;
        z3 = false;
        if (!Strings.isNullOrEmpty(strSubstring)) {
            Preconditions.checkArgument(strSubstring.startsWith("+") && CharMatcher.ascii().matchesAllOf(strSubstring), "Unparseable port number: %s", str);
            i7 = Integer.parseInt(strSubstring);
            Preconditions.checkArgument(isValidPort(i7), "Port number out of range: %s", str);
        }
        return new HostAndPort(str2, i7, z3);
    }

    private static String[] getHostAndPortFromBracketedHost(String str) {
        Preconditions.checkArgument(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        Preconditions.checkArgument(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i7 = iLastIndexOf + 1;
        if (i7 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        Preconditions.checkArgument(str.charAt(i7) == ':', "Only a colon may follow a close bracket: %s", str);
        int i10 = iLastIndexOf + 2;
        for (int i11 = i10; i11 < str.length(); i11++) {
            Preconditions.checkArgument(Character.isDigit(str.charAt(i11)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i10)};
    }

    private static boolean isValidPort(int i7) {
        return i7 >= 0 && i7 <= 65535;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostAndPort) {
            HostAndPort hostAndPort = (HostAndPort) obj;
            if (Objects.equal(this.host, hostAndPort.host) && this.port == hostAndPort.port) {
                return true;
            }
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int i7) {
        return hasPort() ? this.port : i7;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.host, Integer.valueOf(this.port));
    }

    @CanIgnoreReturnValue
    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.host);
            sb2.append(']');
        } else {
            sb2.append(this.host);
        }
        if (hasPort()) {
            sb2.append(':');
            sb2.append(this.port);
        }
        return sb2.toString();
    }

    public HostAndPort withDefaultPort(int i7) {
        Preconditions.checkArgument(isValidPort(i7));
        return hasPort() ? this : new HostAndPort(this.host, i7, this.hasBracketlessColons);
    }
}
