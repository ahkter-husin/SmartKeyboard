/*
 * Copyright 2007 Kasper B. Graversen
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

package org.supercsv.io;

import java.io.IOException;
import java.util.List;

/**
 * Supertype for readers reading into lists.
 * 
 * @author Kasper B. Graversen
 */
public interface ICsvListReader extends ICsvReader {
/**
 * Plain reading a line into a list of strings. This is the traditional and hence very low-level approach to CSV file
 * reading and consequently should be avoided.
 * 
 * @return null if end-of-file or a list representing the read line *
 * @since 1.0
 */
public List<String> read() throws IOException;

}