package dec;

/**
 * 
 * 
 * <p>
 * Title: 市政管网安全运营管理平台 /p>
 * 
 * <p>
 * Description: 示例 业务类
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2012
 * </p>
 * 
 * <p>
 * Company: 西安交大长天软件股份有限公司
 * </p>
 * 
 * @author dml@2012-12-20
 * @version 1.0
 */

public class TopCoder {
	/**
	 * 
	 Problem Statement      Thirty One is a card game for 2 or more players.
	 * The game can be played with one or more decks of standard cards. The aim
	 * of the game is to try and make the value of your hand as close to 31
	 * points as possible without going over 31 points. A hand consists of
	 * exactly 3 cards. Each number card (2, 3, ... 9, 10) is worth the value
	 * written on the card; Jack (J), Queen (Q) and King (K) are all worth 10;
	 * while an Ace (A) is worth either 1 or 11 depending on which will give a
	 * greater total without going over 31 points. There is one exception
	 * however; if a hand consists of 3 identical cards then the value of that
	 * hand automatically becomes 30.5 points. Each element in hands will
	 * contain exactly three cards, where cards are separated by exactly one
	 * space. For example "A 10 K" is a hand consisting of Ace, 10 and King. The
	 * value of this hand is 11 + 10 + 10 = 31. Note that we chose Ace to be 11
	 * and not 1 since that gives us a greater total without exceeding 31. Given
	 * a String[] of players' hands return the index of the winning player,
	 * where element i (0-indexed) in hands belongs to player i. If two or more
	 * players are tied for the lead then return the player with the lower
	 * index. Definition      Class: ThirtyOne Method: findWinner Parameters:
	 * String[] Returns: int Method signature: int findWinner(String[] hands)
	 * (be sure your method is public)     
	 * 
	 * Constraints - hands will contain between 2 and 50 elements inclusive. -
	 * each element in hands will have exactly three cards, where cards are
	 * separated by exactly one space add that there are no leading/trailing
	 * spaces. - cards in hands will be 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A.
	 * Examples 0)
	 * 
	 *      {"10 A A", "K 2 3"} Returns: 0 The value of the first hand is 10 +
	 * 11 + 1 = 22. Notice that we chose the last Ace to be 1, otherwise our
	 * total would have been over 31. The value of the second hand is 10 + 2 + 3
	 * = 15. The first hand is closer to 31 so it wins. 1)
	 * 
	 *      {"2 3 4", "10 6 8", "A K 3"} Returns: 1 The value of the first hand
	 * is 2 + 3 + 4 = 9. The value of the second hand is 10 + 6 + 8 = 24. The
	 * value of the third hand is 11 + 10 + 3 = 24. However the second hand wins
	 * since it comes earlier than the third hand. 2)
	 * 
	 *      {"J 5 2","2 7 5","10 J 2","J 6 2","J Q K"} Returns: 4
	 * 
	 * 3)
	 * 
	 *      {"Q K K", "10 J Q", "A 8 A", "2 2 2"} Returns: 3 The last hand has
	 * three identical cards so its value is 30.5 4)
	 * 
	 *      {"Q 6 6","7 8 3","3 7 2","K Q 6","Q 6 3","5 3 8","10 J Q","4 8 4",
	 * "Q 2 5","8 A 8",
	 * "9 10 10","2 K 5","10 4 5","Q 4 Q","3 J 2","7 4 4","3 9 7"
	 * ,"A 4 4","Q 7 7","10 9 A", "J 3 5","5 8 9","Q Q 7"} Returns: 6
	 * 
	 * This problem statement is the exclusive and proprietary property of
	 * TopCoder, Inc. Any unauthorized use or reproduction of this information
	 * without the prior written consent of TopCoder, Inc. is strictly
	 * prohibited. (c)2003, TopCoder, Inc. All rights reserved.
	 */
}
