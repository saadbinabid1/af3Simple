/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * Contributors:
 * 
 *    Kevin Bauer - Initial implementation
 *******************************************************************************/
package com.jama.oslc.model.trs;

import java.net.URI;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;





/**
 * An HTTP GET on a Tracked Resource Set URI returns a representation structured
 * as follows (note: for exposition, the example snippets show the RDF 
 * information content using Turtle; the actual representation of these 
 * resources "on the wire" may vary): 
 * <pre>
# Resource: http://cm1.example.com/trackedResourceSet
{@literal @prefix trs: <http://jazz.net/ns/trs#> .}

{@code
<http://cm1.example.com/trackedResourceSet>
  a trs:TrackedResourceSet ;
  trs:base <http://cm1.example.com/baseResources> ;
  trs:changeLog [
    a trs:ChangeLog ; 
    trs:changes ( ... ) .
  ] .
}
</pre>

<p>A Tracked Resource Set MUST provide references to the Base and Change Log using
the trs:base and trs:changeLog predicates respectively. A typical Client will 
periodically poll the Tracked Resource Set looking for recent Change Events. 
In order to cater to this usage, the Tracked Resource Set's HTTP response MUST 
contain the triples for the referenced Change Log (i.e., via a Blank Node, or 
an inline named Resource). 

<p>The Server SHOULD also support etags, caching, and conditional GETs for Tracked 
Resource Set resources and relegate the Base to separate resources. 

 * 
 * Tracked Resource Set with non-empty change log
 */
@OslcNamespace(TRSConstants.TRS_NAMESPACE)
@OslcName("TrackedResourceSet")
@OslcResourceShape(title = "Tracked Resource Set  Shape", describes = TRSConstants.TRS_TYPE_TRACKED_RESOURCE_SET)
public class TrackedResourceSet extends AbstractResource
{
	private ChangeLog changeLog;
	private URI base;
	
	/**
	 * @return the changeLog
	 */
	@OslcName(TRSConstants.TRS_TERM_CHANGE_LOG)
	@OslcDescription("A Change Log providing a time series of incremental adjustments to the Resource Set.")
	@OslcPropertyDefinition(TRSConstants.TRS_CHANGE_LOG)
	@OslcTitle("Change Log")
	@OslcRepresentation(Representation.Inline) // added by axel
	@OslcValueType(ValueType.LocalResource) // added by axel
	@OslcRange(TRSConstants.TRS_TYPE_CHANGE_LOG)
	public ChangeLog getChangeLog() {
		return changeLog;
	}
	
	/**
	 * @param changeLog the changeLog to set
	 */
	public void setChangeLog(ChangeLog changeLog) {
		this.changeLog = changeLog;
	}

	/**
	 * @return the base
	 */
	@OslcName(TRSConstants.TRS_TERM_BASE)
	@OslcDescription("An enumeration of the Resources in the Resource Set.")
	@OslcPropertyDefinition(TRSConstants.TRS_BASE)
	@OslcTitle("Base")
	public URI getBase() {
		return base;
	}
	
	/**
	 * @param base the base to set
	 */
	public void setBase(URI base) {
		this.base = base;
	}
}
