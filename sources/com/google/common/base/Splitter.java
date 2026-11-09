package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    @Beta
    public static final class MapSplitter {
        private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final Splitter entrySplitter;
        private final Splitter outerSplitter;

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.outerSplitter.split(charSequence)) {
                Iterator itSplittingIterator = this.entrySplitter.splittingIterator(str);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                String str2 = (String) itSplittingIterator.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                linkedHashMap.put(str2, (String) itSplittingIterator.next());
                Preconditions.checkArgument(!itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private MapSplitter(Splitter splitter, Splitter splitter2) {
            this.outerSplitter = splitter;
            this.entrySplitter = (Splitter) Preconditions.checkNotNull(splitter2);
        }
    }

    public static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        public abstract int separatorEnd(int i7);

        public abstract int separatorStart(int i7);

        @Override // com.google.common.base.AbstractIterator
        @CheckForNull
        public String computeNext() {
            int i7 = this.offset;
            while (true) {
                int i10 = this.offset;
                if (i10 == -1) {
                    return endOfData();
                }
                int iSeparatorStart = separatorStart(i10);
                if (iSeparatorStart == -1) {
                    iSeparatorStart = this.toSplit.length();
                    this.offset = -1;
                } else {
                    this.offset = separatorEnd(iSeparatorStart);
                }
                int i11 = this.offset;
                if (i11 == i7) {
                    int i12 = i11 + 1;
                    this.offset = i12;
                    if (i12 > this.toSplit.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i7 < iSeparatorStart && this.trimmer.matches(this.toSplit.charAt(i7))) {
                        i7++;
                    }
                    while (iSeparatorStart > i7 && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                        iSeparatorStart--;
                    }
                    if (!this.omitEmptyStrings || i7 != iSeparatorStart) {
                        int i13 = this.limit;
                        if (i13 == 1) {
                            iSeparatorStart = this.toSplit.length();
                            this.offset = -1;
                            while (iSeparatorStart > i7 && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                                iSeparatorStart--;
                            }
                        } else {
                            this.limit = i13 - 1;
                        }
                        return this.toSplit.subSequence(i7, iSeparatorStart).toString();
                    }
                    i7 = this.offset;
                }
            }
        }
    }

    public interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static Splitter fixedLength(final int i7) {
        Preconditions.checkArgument(i7 > 0, "The length may not be less than 1");
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.4
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i10) {
                        return i10;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i10) {
                        int i11 = i10 + i7;
                        if (i11 < this.toSplit.length()) {
                            return i11;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public static Splitter on(char c6) {
        return on(CharMatcher.is(c6));
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
        return on(Platform.compilePattern(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.iterator(this, charSequence);
    }

    public Splitter limit(int i7) {
        Preconditions.checkArgument(i7 > 0, "must be greater than zero: %s", i7);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i7);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public Iterable<String> split(final CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new Iterable<String>() { // from class: com.google.common.base.Splitter.5
            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return Splitter.this.splittingIterator(charSequence);
            }

            public String toString() {
                Joiner joinerOn = Joiner.on(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                StringBuilder sbAppendTo = joinerOn.appendTo(sb2, (Iterable<? extends Object>) this);
                sbAppendTo.append(']');
                return sbAppendTo.toString();
            }
        };
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> itSplittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    @Beta
    public MapSplitter withKeyValueSeparator(String str) {
        return withKeyValueSeparator(on(str));
    }

    private Splitter(Strategy strategy, boolean z3, CharMatcher charMatcher, int i7) {
        this.strategy = strategy;
        this.omitEmptyStrings = z3;
        this.trimmer = charMatcher;
        this.limit = i7;
    }

    public static Splitter on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i7) {
                        return i7 + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i7) {
                        return charMatcher.indexIn(this.toSplit, i7);
                    }
                };
            }
        });
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    @Beta
    public MapSplitter withKeyValueSeparator(char c6) {
        return withKeyValueSeparator(on(c6));
    }

    @Beta
    public MapSplitter withKeyValueSeparator(Splitter splitter) {
        return new MapSplitter(splitter);
    }

    public static Splitter on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i7) {
                        return str.length() + i7;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i7) {
                        int length = str.length();
                        int length2 = this.toSplit.length() - length;
                        while (i7 <= length2) {
                            for (int i10 = 0; i10 < length; i10++) {
                                if (this.toSplit.charAt(i10 + i7) != str.charAt(i10)) {
                                    i7++;
                                }
                            }
                            return i7;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    @GwtIncompatible
    public static Splitter on(Pattern pattern) {
        return on(new JdkPattern(pattern));
    }

    private static Splitter on(final CommonPattern commonPattern) {
        Preconditions.checkArgument(!commonPattern.matcher("").matches(), "The pattern may not match the empty string: %s", commonPattern);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                final CommonMatcher commonMatcherMatcher = commonPattern.matcher(charSequence);
                return new SplittingIterator(this, splitter, charSequence) { // from class: com.google.common.base.Splitter.3.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i7) {
                        return commonMatcherMatcher.end();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i7) {
                        if (commonMatcherMatcher.find(i7)) {
                            return commonMatcherMatcher.start();
                        }
                        return -1;
                    }
                };
            }
        });
    }
}
