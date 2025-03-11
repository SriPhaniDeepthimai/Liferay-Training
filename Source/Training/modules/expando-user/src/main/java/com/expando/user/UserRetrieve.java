package com.expando.user;
import com.liferay.expando.kernel.model.ExpandoValue;
import com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil;



public class UserRetrieve {
	
	public static Object getExpandoValue(long companyId, String className, String columnName, long classPK) {
        try {
            ExpandoValue expandoValue = ExpandoValueLocalServiceUtil.getValue(
                companyId, className, "","Linked_In_Profile", classPK);

            if (expandoValue != null) {
                return expandoValue.getData();
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging purposes.
        }
        return null; // Return null if Expando value is not found.
    }

    public static void main(String[] args) {
        // Example usage: Retrieving Expando value for a User
        long companyId = 20101; // Replace with actual companyId
        long userId = 12345; // Replace with actual userId
        String columnName = "CustomField"; // Replace with your Expando column name

        Object customFieldValue = getExpandoValue(companyId, "com.liferay.portal.kernel.model.User", columnName, userId);
        System.out.println("Expando Value: " + customFieldValue);
    }

}



    /**
     * Retrieves the value of a custom Expando column.
     *
     * @param companyId   The ID of the Liferay instance (company).
     * @param className   The class name where the Expando column is stored (e.g., "com.liferay.portal.kernel.model.User").
     * @param columnName  The name of the Expando column (custom field name).
     * @param classPK     The primary key of the entity (e.g., userId for a user).
     * @return            The Expando value as an Object, or null if not found.
     */
 
