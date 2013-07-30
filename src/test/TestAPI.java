package test;

import org.knoesis.normalize.NormalizeDate;

public class TestAPI {
		public static void main(String[] args) {
				String temporalExpression = "3 months prior";
				String documentCreationTime = "2013-07-25";
				
				NormalizeDate nd = new NormalizeDate();
				String normalizedText = nd.getNormalizedText(temporalExpression);
				String normalizedDate = nd.normalize(temporalExpression, documentCreationTime);
				
				System.out.println("Temporal Expression: " + temporalExpression);
				System.out.println("Document Creation Time: " + documentCreationTime);
				System.out.println("Normalized Text: " + normalizedText);
				System.out.println("Normalized Date: " + normalizedDate);
				
		}
}
