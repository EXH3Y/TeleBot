package exh3y.telebot.data;

import org.json.JSONObject;

public class TelegramMessage extends JSONObject {

	/**
	 * <p>
	 * Returns the command as array.
	 * </p>
	 * 
	 * @return The command as array
	 * @since 0.0.3
	 */
	public String[] toCommandArray() {

		return this.getString("text").split(" ");
	}

	/**
	 * <p>
	 * Returns the chatId of the current message.
	 * </p>
	 * 
	 * @return The chatID
	 * @since 0.0.3
	 */
	public int getChatId() {

		return this.getJSONObject("chat").getInt("id");
	}

}