/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smartitengineering.user.service.impl.hbase.solr;

import com.smartitengineering.common.dao.search.solr.spi.ObjectIdentifierQuery;
import com.smartitengineering.user.domain.Person;
import org.apache.solr.client.solrj.util.ClientUtils;

/**
 *
 * @author saumitra
 */
public class PersonIdentifierQueryImpl implements ObjectIdentifierQuery<Person>{

  @Override
  public String getQuery(Person object) {
    return new StringBuilder("id: person\\:").append(ClientUtils.escapeQueryChars(object.getId().toString())).toString();
  }

}
