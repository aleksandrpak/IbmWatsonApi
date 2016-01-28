// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

/**
 * 
 */
public class UserRole
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject userRoleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.UserRole";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ModelGUID("ModelGUID"),
		Name("Name"),
		Description("Description"),
		grantableRoles("System.grantableRoles");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public UserRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.UserRole"));
	}

	protected UserRole(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject userRoleMendixObject)
	{
		if (userRoleMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("System.UserRole", userRoleMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.UserRole");

		this.userRoleMendixObject = userRoleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UserRole.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static system.proxies.UserRole initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.UserRole.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static system.proxies.UserRole initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.UserRole(context, mendixObject);
	}

	public static system.proxies.UserRole load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.UserRole.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.UserRole> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.UserRole> result = new java.util.ArrayList<system.proxies.UserRole>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.UserRole" + xpathConstraint))
			result.add(system.proxies.UserRole.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ModelGUID
	 */
	public final String getModelGUID()
	{
		return getModelGUID(getContext());
	}

	/**
	 * @param context
	 * @return value of ModelGUID
	 */
	public final String getModelGUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ModelGUID.toString());
	}

	/**
	 * Set value of ModelGUID
	 * @param modelguid
	 */
	public final void setModelGUID(String modelguid)
	{
		setModelGUID(getContext(), modelguid);
	}

	/**
	 * Set value of ModelGUID
	 * @param context
	 * @param modelguid
	 */
	public final void setModelGUID(com.mendix.systemwideinterfaces.core.IContext context, String modelguid)
	{
		getMendixObject().setValue(context, MemberNames.ModelGUID.toString(), modelguid);
	}

	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Description
	 */
	public final String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of grantableRoles
	 */
	public final java.util.List<system.proxies.UserRole> getgrantableRoles() throws com.mendix.core.CoreException
	{
		return getgrantableRoles(getContext());
	}

	/**
	 * @param context
	 * @return value of grantableRoles
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<system.proxies.UserRole> getgrantableRoles(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.UserRole> result = new java.util.ArrayList<system.proxies.UserRole>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.grantableRoles.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(system.proxies.UserRole.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of grantableRoles
	 * @param grantableroles
	 */
	public final void setgrantableRoles(java.util.List<system.proxies.UserRole> grantableroles)
	{
		setgrantableRoles(getContext(), grantableroles);
	}

	/**
	 * Set value of grantableRoles
	 * @param context
	 * @param grantableroles
	 */
	public final void setgrantableRoles(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<system.proxies.UserRole> grantableroles)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (system.proxies.UserRole proxyObject : grantableroles)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.grantableRoles.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return userRoleMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.UserRole that = (system.proxies.UserRole) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "System.UserRole";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
