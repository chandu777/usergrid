/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.usergrid.corepersistence.pipeline.read.elasticsearch;


import org.apache.usergrid.persistence.index.CandidateResult;
import org.apache.usergrid.persistence.index.SearchEdge;


/**
 * Create a candidate. This holds the original candidate, as well as the search scope it was found it
 */
public class Candidate {

    private final CandidateResult candidateResult;
    private final SearchEdge searchEdge;


    /**
     * Create a new Candidate for further processing
     * @param candidateResult  The candidate result
     * @param searchEdge The search edge this was searched on
     */
    public Candidate( final CandidateResult candidateResult, final SearchEdge searchEdge ) {
        this.candidateResult = candidateResult;
        this.searchEdge = searchEdge;
    }


    public CandidateResult getCandidateResult() {
        return candidateResult;
    }


    public SearchEdge getSearchEdge() {
        return searchEdge;
    }
}
