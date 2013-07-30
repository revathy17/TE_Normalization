package org.knoesis.normalize;

import java.util.Locale;

import org.timen.TIMEN;

/**
 * @desc Normalize date using timen library
 * @author revathy
 * @date 25-June-2013
 */
public class NormalizeDate {
		
		public static TIMEN timen;
		public NormalizeDate() {
				timen = new TIMEN(Locale.ENGLISH);
		}
		
		/**
		 * 
		 * @param expression: Temporal Expression to be normalized
		 * @param documentCreationTime: Timestamp of the document in yyyy-mm-dd format
		 * @return normalized date value as String
		 */
		public String normalize(String expression, String documentCreationTime) {
				String date = timen.normalize(expression, documentCreationTime);
				return date;
		}
		
		/**
		 * @param expression: Temporal expression
		 * @return Normalized Text
		 */
		public String getNormalizedText(String expression) {
				String normText = timen.getNormTextandPattern(expression);
				return normText;
		}
		
		/**
		 * @desc Close timen
		 */
		public void cleanTimeNResources() {
			timen.close();
		}
		
}
