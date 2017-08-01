package codeu.chat.util;

import codeu.chat.util.Tokenizer;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;

public final class TokenizerTest {
	@Test
	public void testWithNoQuotes() throws IOException {
		final Tokenizer tokenizer = new Tokenizer("hello world are you");
		assertEquals(tokenizer.next(), "hello");
		assertEquals(tokenizer.next(), "world");
		assertEquals(tokenizer.next(), "how");
		assertEquals(tokenizer.next(), "are");
		assertEquals(tokenizer.next(), "you");
		assertEquals(tokenizer.next(), null);
	}

	@Test
	public void testWithQuotes() throws IOException {
		final Tokenizer tokenizer = new Tokenizer("\"hello\" \"how are you\"");
		assertEquals(tokenizer.next(), "hello world");
		assertEquals(tokenizer.next(), "how are you");
		assertEquals(tokenizer.next(), null);
	}
}
