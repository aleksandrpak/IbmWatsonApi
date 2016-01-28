// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.ChangeLogListener;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class resetChangeTracking extends CustomJavaAction<Boolean>
{
	private String collectionUrl;

	public resetChangeTracking(IContext context, String collectionUrl)
	{
		super(context);
		this.collectionUrl = collectionUrl;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		ChangeLogListener.resetDataSyncState(collectionUrl);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "resetChangeTracking";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
