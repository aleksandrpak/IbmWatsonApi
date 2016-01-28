// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

/**
 * 
 */
public class RequestResult
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject requestResultMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RestServices.RequestResult";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RequestUrl("RequestUrl"),
		ResponseCode("ResponseCode"),
		RawResponseCode("RawResponseCode"),
		ETag("ETag"),
		ResponseBody("ResponseBody"),
		_ResponseHeaders("_ResponseHeaders"),
		ErrorDetails("RestServices.ErrorDetails");

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

	public RequestResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RestServices.RequestResult"));
	}

	protected RequestResult(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestResultMendixObject)
	{
		if (requestResultMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RestServices.RequestResult", requestResultMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RestServices.RequestResult");

		this.requestResultMendixObject = requestResultMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RequestResult.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.RequestResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return restservices.proxies.RequestResult.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static restservices.proxies.RequestResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new restservices.proxies.RequestResult(context, mendixObject);
	}

	public static restservices.proxies.RequestResult load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.RequestResult.initialize(context, mendixObject);
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
	 * @return value of RequestUrl
	 */
	public final String getRequestUrl()
	{
		return getRequestUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestUrl
	 */
	public final String getRequestUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.RequestUrl.toString());
	}

	/**
	 * Set value of RequestUrl
	 * @param requesturl
	 */
	public final void setRequestUrl(String requesturl)
	{
		setRequestUrl(getContext(), requesturl);
	}

	/**
	 * Set value of RequestUrl
	 * @param context
	 * @param requesturl
	 */
	public final void setRequestUrl(com.mendix.systemwideinterfaces.core.IContext context, String requesturl)
	{
		getMendixObject().setValue(context, MemberNames.RequestUrl.toString(), requesturl);
	}

	/**
	 * Set value of ResponseCode
	 * @param responsecode
	 */
	public final restservices.proxies.ResponseCode getResponseCode()
	{
		return getResponseCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ResponseCode
	 */
	public final restservices.proxies.ResponseCode getResponseCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ResponseCode.toString());
		if (obj == null)
			return null;

		return restservices.proxies.ResponseCode.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ResponseCode
	 * @param responsecode
	 */
	public final void setResponseCode(restservices.proxies.ResponseCode responsecode)
	{
		setResponseCode(getContext(), responsecode);
	}

	/**
	 * Set value of ResponseCode
	 * @param context
	 * @param responsecode
	 */
	public final void setResponseCode(com.mendix.systemwideinterfaces.core.IContext context, restservices.proxies.ResponseCode responsecode)
	{
		if (responsecode != null)
			getMendixObject().setValue(context, MemberNames.ResponseCode.toString(), responsecode.toString());
		else
			getMendixObject().setValue(context, MemberNames.ResponseCode.toString(), null);
	}

	/**
	 * @return value of RawResponseCode
	 */
	public final Integer getRawResponseCode()
	{
		return getRawResponseCode(getContext());
	}

	/**
	 * @param context
	 * @return value of RawResponseCode
	 */
	public final Integer getRawResponseCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.RawResponseCode.toString());
	}

	/**
	 * Set value of RawResponseCode
	 * @param rawresponsecode
	 */
	public final void setRawResponseCode(Integer rawresponsecode)
	{
		setRawResponseCode(getContext(), rawresponsecode);
	}

	/**
	 * Set value of RawResponseCode
	 * @param context
	 * @param rawresponsecode
	 */
	public final void setRawResponseCode(com.mendix.systemwideinterfaces.core.IContext context, Integer rawresponsecode)
	{
		getMendixObject().setValue(context, MemberNames.RawResponseCode.toString(), rawresponsecode);
	}

	/**
	 * @return value of ETag
	 */
	public final String getETag()
	{
		return getETag(getContext());
	}

	/**
	 * @param context
	 * @return value of ETag
	 */
	public final String getETag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ETag.toString());
	}

	/**
	 * Set value of ETag
	 * @param etag
	 */
	public final void setETag(String etag)
	{
		setETag(getContext(), etag);
	}

	/**
	 * Set value of ETag
	 * @param context
	 * @param etag
	 */
	public final void setETag(com.mendix.systemwideinterfaces.core.IContext context, String etag)
	{
		getMendixObject().setValue(context, MemberNames.ETag.toString(), etag);
	}

	/**
	 * @return value of ResponseBody
	 */
	public final String getResponseBody()
	{
		return getResponseBody(getContext());
	}

	/**
	 * @param context
	 * @return value of ResponseBody
	 */
	public final String getResponseBody(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ResponseBody.toString());
	}

	/**
	 * Set value of ResponseBody
	 * @param responsebody
	 */
	public final void setResponseBody(String responsebody)
	{
		setResponseBody(getContext(), responsebody);
	}

	/**
	 * Set value of ResponseBody
	 * @param context
	 * @param responsebody
	 */
	public final void setResponseBody(com.mendix.systemwideinterfaces.core.IContext context, String responsebody)
	{
		getMendixObject().setValue(context, MemberNames.ResponseBody.toString(), responsebody);
	}

	/**
	 * @return value of _ResponseHeaders
	 */
	public final String get_ResponseHeaders()
	{
		return get_ResponseHeaders(getContext());
	}

	/**
	 * @param context
	 * @return value of _ResponseHeaders
	 */
	public final String get_ResponseHeaders(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames._ResponseHeaders.toString());
	}

	/**
	 * Set value of _ResponseHeaders
	 * @param _responseheaders
	 */
	public final void set_ResponseHeaders(String _responseheaders)
	{
		set_ResponseHeaders(getContext(), _responseheaders);
	}

	/**
	 * Set value of _ResponseHeaders
	 * @param context
	 * @param _responseheaders
	 */
	public final void set_ResponseHeaders(com.mendix.systemwideinterfaces.core.IContext context, String _responseheaders)
	{
		getMendixObject().setValue(context, MemberNames._ResponseHeaders.toString(), _responseheaders);
	}

	/**
	 * @return value of ErrorDetails
	 */
	public final restservices.proxies.RestServiceError getErrorDetails() throws com.mendix.core.CoreException
	{
		return getErrorDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of ErrorDetails
	 */
	public final restservices.proxies.RestServiceError getErrorDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		restservices.proxies.RestServiceError result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ErrorDetails.toString());
		if (identifier != null)
			result = restservices.proxies.RestServiceError.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ErrorDetails
	 * @param errordetails
	 */
	public final void setErrorDetails(restservices.proxies.RestServiceError errordetails)
	{
		setErrorDetails(getContext(), errordetails);
	}

	/**
	 * Set value of ErrorDetails
	 * @param context
	 * @param errordetails
	 */
	public final void setErrorDetails(com.mendix.systemwideinterfaces.core.IContext context, restservices.proxies.RestServiceError errordetails)
	{
		if (errordetails == null)
			getMendixObject().setValue(context, MemberNames.ErrorDetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ErrorDetails.toString(), errordetails.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return requestResultMendixObject;
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
			final restservices.proxies.RequestResult that = (restservices.proxies.RequestResult) obj;
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
		return "RestServices.RequestResult";
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
