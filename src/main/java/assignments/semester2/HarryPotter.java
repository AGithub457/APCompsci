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

public class HarryPotter
{
  public static void main (String[] args)
  {
      PotterBook stone = new PotterBook(700,30,"The Sorcerer's Stone");
      PotterBook prisoner = new PotterBook(750,40,"The Prisoner of Azkaban");
      
      stone.potterMessage();
      System.out.println();
      prisoner.potterMessage();
      
  }
}
