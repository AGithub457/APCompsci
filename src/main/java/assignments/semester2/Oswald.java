/*
 * Copyright © 2015 Armand Agopian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments.semester2;

public class Oswald extends Pet
{
    private int dimension;
    public Oswald(String oswaldName, int oswaldDimension)
    {
        super(oswaldName);
        dimension = oswaldDimension;
    }
    public int getDimension()
    {return dimension;}
    public String toString()
    {return super.toString() + " is a "+dimension+"by "+dimension+" cube.";}
    public String speak()
    {return "TrRuRuLsLdRt";}
    public String move()
    {return "click*clack*click*krrrkkr";}
}
