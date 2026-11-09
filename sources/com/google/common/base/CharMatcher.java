package com.google.common.base;

import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements Predicate<Character> {
    private static final int DISTINCT_CHARS = 65536;

    public static final class And extends CharMatcher {
        final CharMatcher first;
        final CharMatcher second;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.first = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.second = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return this.first.matches(c6) && this.second.matches(c6);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.first.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.second.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strValueOf = String.valueOf(this.first);
            String strValueOf2 = String.valueOf(this.second);
            StringBuilder sbP = d.p("CharMatcher.and(", strValueOf2.length() + strValueOf.length() + 19, strValueOf, ", ", strValueOf2);
            sbP.append(")");
            return sbP.toString();
        }
    }

    public static final class Any extends NamedFastMatcher {
        static final Any INSTANCE = new Any();

        private Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c6) {
            return charSequence.length() == 0 ? "" : String.valueOf(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c6) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c6);
            return new String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i7) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i7, length);
            if (i7 == length) {
                return -1;
            }
            return i7;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i7 = 0; i7 < charSequence.length(); i7++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    public static final class AnyOf extends CharMatcher {
        private final char[] chars;

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.chars = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return Arrays.binarySearch(this.chars, c6) >= 0;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            for (char c6 : this.chars) {
                bitSet.set(c6);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c6 : this.chars) {
                sb2.append(CharMatcher.showCharacter(c6));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    public static final class Ascii extends NamedFastMatcher {
        static final Ascii INSTANCE = new Ascii();

        public Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return c6 <= 127;
        }
    }

    @GwtIncompatible
    public static final class BitSetMatcher extends NamedFastMatcher {
        private final BitSet table;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return this.table.get(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.or(this.table);
        }

        private BitSetMatcher(BitSet bitSet, String str) {
            super(str);
            this.table = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    public static final class BreakingWhitespace extends CharMatcher {
        static final CharMatcher INSTANCE = new BreakingWhitespace();

        private BreakingWhitespace() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            if (c6 != ' ' && c6 != 133 && c6 != 5760) {
                if (c6 != 8199) {
                    if (c6 != 8287 && c6 != 12288 && c6 != 8232 && c6 != 8233) {
                        switch (c6) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c6 >= 8192 && c6 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    public static final class Digit extends RangesMatcher {
        static final Digit INSTANCE = new Digit();
        private static final String ZEROES = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        private Digit() {
            super("CharMatcher.digit()", zeroes(), nines());
        }

        private static char[] nines() {
            char[] cArr = new char[37];
            for (int i7 = 0; i7 < 37; i7++) {
                cArr[i7] = (char) (ZEROES.charAt(i7) + '\t');
            }
            return cArr;
        }

        private static char[] zeroes() {
            return ZEROES.toCharArray();
        }
    }

    public static abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new NegatedFastMatcher(this);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    public static final class ForPredicate extends CharMatcher {
        private final Predicate<? super Character> predicate;

        public ForPredicate(Predicate<? super Character> predicate) {
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return this.predicate.apply(Character.valueOf(c6));
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strValueOf = String.valueOf(this.predicate);
            return d.i(strValueOf.length() + 26, "CharMatcher.forPredicate(", strValueOf, ")");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(Character ch2) {
            return this.predicate.apply(Preconditions.checkNotNull(ch2));
        }
    }

    public static final class InRange extends FastMatcher {
        private final char endInclusive;
        private final char startInclusive;

        public InRange(char c6, char c10) {
            Preconditions.checkArgument(c10 >= c6);
            this.startInclusive = c6;
            this.endInclusive = c10;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return this.startInclusive <= c6 && c6 <= this.endInclusive;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(this.startInclusive, this.endInclusive + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strShowCharacter = CharMatcher.showCharacter(this.startInclusive);
            String strShowCharacter2 = CharMatcher.showCharacter(this.endInclusive);
            StringBuilder sbP = d.p("CharMatcher.inRange('", d.c(d.c(27, strShowCharacter), strShowCharacter2), strShowCharacter, "', '", strShowCharacter2);
            sbP.append("')");
            return sbP.toString();
        }
    }

    public static final class Invisible extends RangesMatcher {
        static final Invisible INSTANCE = new Invisible();
        private static final String RANGE_ENDS = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        private static final String RANGE_STARTS = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        private Invisible() {
            super("CharMatcher.invisible()", RANGE_STARTS.toCharArray(), RANGE_ENDS.toCharArray());
        }
    }

    public static final class Is extends FastMatcher {
        private final char match;

        public Is(char c6) {
            this.match = c6;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? this : CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return c6 == this.match;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c6) {
            return charSequence.toString().replace(this.match, c6);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strShowCharacter = CharMatcher.showCharacter(this.match);
            return d.i(d.c(18, strShowCharacter), "CharMatcher.is('", strShowCharacter, "')");
        }
    }

    public static final class IsEither extends FastMatcher {
        private final char match1;
        private final char match2;

        public IsEither(char c6, char c10) {
            this.match1 = c6;
            this.match2 = c10;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return c6 == this.match1 || c6 == this.match2;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(this.match1);
            bitSet.set(this.match2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strShowCharacter = CharMatcher.showCharacter(this.match1);
            String strShowCharacter2 = CharMatcher.showCharacter(this.match2);
            return d.k("CharMatcher.anyOf(\"", d.c(d.c(21, strShowCharacter), strShowCharacter2), strShowCharacter, strShowCharacter2, "\")");
        }
    }

    public static final class IsNot extends FastMatcher {
        private final char match;

        public IsNot(char c6) {
            this.match = c6;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return c6 != this.match;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.is(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? CharMatcher.any() : this;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.match);
            bitSet.set(this.match + 1, CharMatcher.DISTINCT_CHARS);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strShowCharacter = CharMatcher.showCharacter(this.match);
            return d.i(d.c(21, strShowCharacter), "CharMatcher.isNot('", strShowCharacter, "')");
        }
    }

    public static final class JavaDigit extends CharMatcher {
        static final JavaDigit INSTANCE = new JavaDigit();

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return Character.isDigit(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    public static final class JavaIsoControl extends NamedFastMatcher {
        static final JavaIsoControl INSTANCE = new JavaIsoControl();

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            if (c6 > 31) {
                return c6 >= 127 && c6 <= 159;
            }
            return true;
        }
    }

    public static final class JavaLetter extends CharMatcher {
        static final JavaLetter INSTANCE = new JavaLetter();

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return Character.isLetter(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    public static final class JavaLetterOrDigit extends CharMatcher {
        static final JavaLetterOrDigit INSTANCE = new JavaLetterOrDigit();

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return Character.isLetterOrDigit(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    public static final class JavaLowerCase extends CharMatcher {
        static final JavaLowerCase INSTANCE = new JavaLowerCase();

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return Character.isLowerCase(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    public static final class JavaUpperCase extends CharMatcher {
        static final JavaUpperCase INSTANCE = new JavaUpperCase();

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return Character.isUpperCase(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    public static abstract class NamedFastMatcher extends FastMatcher {
        private final String description;

        public NamedFastMatcher(String str) {
            this.description = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
            return this.description;
        }
    }

    public static class Negated extends CharMatcher {
        final CharMatcher original;

        public Negated(CharMatcher charMatcher) {
            this.original = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.original.countIn(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return !this.original.matches(c6);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.original.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.original.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.original;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.original.setBits(bitSet2);
            bitSet2.flip(0, CharMatcher.DISTINCT_CHARS);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strValueOf = String.valueOf(this.original);
            return d.h(strValueOf.length() + 9, strValueOf, ".negate()");
        }
    }

    public static class NegatedFastMatcher extends Negated {
        public NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    public static final class None extends NamedFastMatcher {
        static final None INSTANCE = new None();

        private None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c6) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c6) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i7) {
            Preconditions.checkPositionIndex(i7, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    public static final class Or extends CharMatcher {
        final CharMatcher first;
        final CharMatcher second;

        public Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.first = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.second = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return this.first.matches(c6) || this.second.matches(c6);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            this.first.setBits(bitSet);
            this.second.setBits(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String strValueOf = String.valueOf(this.first);
            String strValueOf2 = String.valueOf(this.second);
            StringBuilder sbP = d.p("CharMatcher.or(", strValueOf2.length() + strValueOf.length() + 18, strValueOf, ", ", strValueOf2);
            sbP.append(")");
            return sbP.toString();
        }
    }

    public static class RangesMatcher extends CharMatcher {
        private final String description;
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.description = str;
            this.rangeStarts = cArr;
            this.rangeEnds = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i7 = 0;
            while (i7 < cArr.length) {
                Preconditions.checkArgument(cArr[i7] <= cArr2[i7]);
                int i10 = i7 + 1;
                if (i10 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i7] < cArr[i10]);
                }
                i7 = i10;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            int iBinarySearch = Arrays.binarySearch(this.rangeStarts, c6);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i7 = (~iBinarySearch) - 1;
            return i7 >= 0 && c6 <= this.rangeEnds[i7];
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.description;
        }
    }

    public static final class SingleWidth extends RangesMatcher {
        static final SingleWidth INSTANCE = new SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    @VisibleForTesting
    public static final class Whitespace extends NamedFastMatcher {
        static final int MULTIPLIER = 1682554634;
        static final String TABLE = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";
        static final int SHIFT = Integer.numberOfLeadingZeros(31);
        static final Whitespace INSTANCE = new Whitespace();

        public Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c6) {
            return TABLE.charAt((MULTIPLIER * c6) >>> SHIFT) == c6;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            for (int i7 = 0; i7 < 32; i7++) {
                bitSet.set(TABLE.charAt(i7));
            }
        }
    }

    public static CharMatcher any() {
        return Any.INSTANCE;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length != 1) {
            return length != 2 ? new AnyOf(charSequence) : isEither(charSequence.charAt(0), charSequence.charAt(1));
        }
        return is(charSequence.charAt(0));
    }

    public static CharMatcher ascii() {
        return Ascii.INSTANCE;
    }

    public static CharMatcher breakingWhitespace() {
        return BreakingWhitespace.INSTANCE;
    }

    @Deprecated
    public static CharMatcher digit() {
        return Digit.INSTANCE;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i7, int i10, char c6, StringBuilder sb2, boolean z3) {
        while (i7 < i10) {
            char cCharAt = charSequence.charAt(i7);
            if (!matches(cCharAt)) {
                sb2.append(cCharAt);
                z3 = false;
            } else if (!z3) {
                sb2.append(c6);
                z3 = true;
            }
            i7++;
        }
        return sb2.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new ForPredicate(predicate);
    }

    public static CharMatcher inRange(char c6, char c10) {
        return new InRange(c6, c10);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return Invisible.INSTANCE;
    }

    public static CharMatcher is(char c6) {
        return new Is(c6);
    }

    private static IsEither isEither(char c6, char c10) {
        return new IsEither(c6, c10);
    }

    public static CharMatcher isNot(char c6) {
        return new IsNot(c6);
    }

    @GwtIncompatible
    private static boolean isSmall(int i7, int i10) {
        return i7 <= 1023 && i10 > i7 * 64;
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return JavaDigit.INSTANCE;
    }

    public static CharMatcher javaIsoControl() {
        return JavaIsoControl.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return JavaLetter.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return JavaLetterOrDigit.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return JavaLowerCase.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return JavaUpperCase.INSTANCE;
    }

    public static CharMatcher none() {
        return None.INSTANCE;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @GwtIncompatible
    private static CharMatcher precomputedPositive(int i7, BitSet bitSet, String str) {
        if (i7 == 0) {
            return none();
        }
        if (i7 == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i7 != 2) {
            return isSmall(i7, bitSet.length()) ? SmallCharMatcher.from(bitSet, str) : new BitSetMatcher(bitSet, str);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return isEither(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c6) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c6 & 15);
            c6 = (char) (c6 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return SingleWidth.INSTANCE;
    }

    public static CharMatcher whitespace() {
        return Whitespace.INSTANCE;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c6) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (matches(cCharAt)) {
                if (cCharAt != c6 || (i7 != length - 1 && matches(charSequence.charAt(i7 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i7);
                    sb2.append(c6);
                    return finishCollapseFrom(charSequence, i7 + 1, length, c6, sb2, true);
                }
                i7++;
            }
            i7++;
            c6 = c6;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i7 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (matches(charSequence.charAt(i10))) {
                i7++;
            }
        }
        return i7;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c6);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new Negated(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }

    public CharMatcher precomputed() {
        return Platform.precomputeCharMatcher(this);
    }

    @GwtIncompatible
    public CharMatcher precomputedInternal() {
        String strConcat;
        BitSet bitSet = new BitSet();
        setBits(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= DISTINCT_CHARS) {
            return precomputedPositive(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, DISTINCT_CHARS);
        int i7 = DISTINCT_CHARS - iCardinality;
        final String string = toString();
        if (string.endsWith(".negate()")) {
            strConcat = u.f(9, 0, string);
        } else {
            strConcat = ".negate()".length() != 0 ? string.concat(".negate()") : new String(string);
        }
        return new NegatedFastMatcher(this, precomputedPositive(i7, bitSet, strConcat)) { // from class: com.google.common.base.CharMatcher.1
            @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
            public String toString() {
                return string;
            }
        };
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i7 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i7++;
                } else {
                    charArray[iIndexIn - i7] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new String(charArray, 0, iIndexIn - i7);
        }
    }

    public String replaceFrom(CharSequence charSequence, char c6) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c6;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c6;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    @GwtIncompatible
    public void setBits(BitSet bitSet) {
        for (int i7 = 65535; i7 >= 0; i7--) {
            if (matches((char) i7)) {
                bitSet.set(i7);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c6) {
        int length = charSequence.length();
        int i7 = length - 1;
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = i7;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        if (i10 == 0 && i11 == i7) {
            return collapseFrom(charSequence, c6);
        }
        int i12 = i11 + 1;
        return finishCollapseFrom(charSequence, i10, i12, c6, new StringBuilder(i12 - i10), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && matches(charSequence.charAt(i7))) {
            i7++;
        }
        int i10 = length - 1;
        while (i10 > i7 && matches(charSequence.charAt(i10))) {
            i10--;
        }
        return charSequence.subSequence(i7, i10 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!matches(charSequence.charAt(i7))) {
                return charSequence.subSequence(i7, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public int indexIn(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i7, length);
        while (i7 < length) {
            if (matches(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i7 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(u.c(length2, 3, 2, 16));
        do {
            sb2.append((CharSequence) string, i7, iIndexIn);
            sb2.append(charSequence2);
            i7 = iIndexIn + 1;
            iIndexIn = indexIn(string, i7);
        } while (iIndexIn != -1);
        sb2.append((CharSequence) string, i7, length2);
        return sb2.toString();
    }
}
