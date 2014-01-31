import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Artem Loginov(ALohinov@luxoft.com)
 * @since 1/31/14 1:49 PM
 */
public class ConsoleReader {
	private BufferedReader br;

	public ConsoleReader(InputStream inputStream) {
		br = new BufferedReader(new InputStreamReader(inputStream));
	}

	public int readInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public String readString() throws IOException {
		return br.readLine();
	}
}
