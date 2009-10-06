package it0005.test;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import it0005.HelloWorldStaticJNI;
import junit.framework.Assert;
import junit.framework.TestCase;

public class HelloWorldStaticJNITest
    extends TestCase
{

    public HelloWorldStaticJNITest( String name )
    {
        super( name );
    }

    protected void setUp()
        throws Exception
    {
        super.setUp();
    }

    protected void tearDown()
        throws Exception
    {
        super.tearDown();
    }

    public void testNativeHelloWorldJNI()
        throws Exception
    {
        HelloWorldStaticJNI app = new HelloWorldStaticJNI();

        Assert.assertEquals( "Hello Static NAR World!", app.sayHello() );
    }
}
