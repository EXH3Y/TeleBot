package exh3y.telebot.data.keyboards;

import org.json.JSONArray;
import org.json.JSONObject;

import exh3y.telebot.data.InlineKeyboardButton;

public class InlineKeyboardMarkup extends ReplyMarkup {

	private InlineKeyboardButton[][] keyboard;

	/**
	 * Creates a new InlineKeyboardMarkup
	 * 
	 * @param keyboard
	 *            The buttons to show to the user
	 * @see <a href="https://core.telegram.org/bots/api#inlinekeyboardmarkup">
	 *      https://core.telegram.org/bots/api#inlinekeyboardmarkup</a>
	 */
	public InlineKeyboardMarkup(InlineKeyboardButton[][] keyboard) {

		this.keyboard = keyboard;
	}

	public InlineKeyboardMarkup(String[][] buttons) {

		InlineKeyboardButton[][] keyboard = new InlineKeyboardButton[buttons.length][];

		for (int i = 0; i < buttons.length; i++) {

			keyboard[i] = new InlineKeyboardButton[buttons[i].length];

			for (int j = 0; j < buttons[i].length; j++) {

				keyboard[i][j] = new InlineKeyboardButton(buttons[i][j]);

			}

		}

	}

	@Override
	public String toJSONString() {

		JSONArray keyboard = new JSONArray(this.keyboard);
		JSONObject object = new JSONObject();

		object.put("inline_keyboard", keyboard);

		return object.toString();
	}

}