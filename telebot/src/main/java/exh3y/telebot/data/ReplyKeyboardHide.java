package exh3y.telebot.data;

import org.json.JSONObject;
import org.json.JSONString;

public class ReplyKeyboardHide implements JSONString {

	public boolean selective;

	/**
	 * Creates a new ReplyKeyboardHide object.
	 * 
	 * @param selective
	 * @see <a href="https://core.telegram.org/bots/api#replykeyboardhide">https
	 *      ://core.telegram.org/bots/api#replykeyboardhide</a>
	 * @since 0.0.4
	 */
	public ReplyKeyboardHide(boolean selective) {

		this.selective = selective;
	}

	@Override
	public String toJSONString() {

		JSONObject object = new JSONObject();
		object.put("hide_keyboard", true);

		if (selective) {
			object.put("selective", true);
		}

		return object.toString();
	}

}
