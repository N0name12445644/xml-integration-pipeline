# XML-to-XArchive Data Integration Pipeline

A lightweight, high-performance Java application designed to process, transform, and map legacy XML data into a standardized corporate "X-Archive" format using XSLT stylesheets.

##  Project Overview
This project simulates an enterprise-grade data integration pipeline. It reads raw incoming XML files from system resources, applies strict XSLT transformation rules, and outputs a structured archival-ready XML batch.

Designed for reliability and performance, it demonstrates core integration patterns without unnecessary architectural over-engineering.

## Tech Stack

* **Apache Maven** (Dependency management & Build lifecycle)
* **JAXP / XSLT 1.0/2.0** (XML transformation engine)
* **IntelliJ IDEA** (Development environment)


## How It Works (Pipeline Flow)
1. **Resource Loading:** Safely loads input data and XSLT templates using Java `ClassLoader` and `InputStream`.
2. **Safe Fallbacks:** Includes defensive `null`-checks to handle missing configuration files gracefully.
3. **Transformation Engine:** Initializes the `TransformerFactory` and applies the XSLT stylesheet via `StreamSource`.
4. **Execution & Output:** Processes the data stream through a `StringWriter` buffer and outputs the formatted result for archival storage.


