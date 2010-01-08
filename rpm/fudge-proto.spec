# Copyright 2009 by OpenGamma Inc and other contributors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

Name:		fudge-proto
Version:	0.1
Release:	1%{?dist}
Summary:	Fudge proto file compiler

Group:		Development/Tools
License:	http://www.apache.org/licenses/LICENSE-2.0
URL:		http://www.fudgemsg.org/proto
Source0:	fudge-proto.jar
Source1:	fudge-proto-javadocs.jar
BuildRoot:	%(mktemp -ud %{_tmppath}/%{name}-%{version}-%{release}-XXXXXX)
BuildArch:	noarch

Requires:	jpackage-utils, fudge-java, antlr3

%description
Generates Java, C, C++, and C# bindings for Fudge messages described by the .proto syntax.

%prep

%install
rm -rf $RPM_BUILD_ROOT
mkdir -p %{buildroot}%{_javadir}
cp -p %{SOURCE0} %{buildroot}%{_javadir}/%{name}-%{version}.jar
cd %{buildroot}%{_javadir}
ln -s %{name}-%{version}.jar %{name}.jar
mkdir -p %{buildroot}%{_javadocdir}/%{name}-%{version}
cd %{buildroot}%{_javadocdir}/%{name}-%{version}
jar xf %{SOURCE1}
cd ..
ln -s %{name}-%{version} %{name}
%jpackage_script org.fudgemsg.proto.CommandLine "" "" %{name}.jar:fudge-java.jar:antlr3.jar %{name}

%clean
#rm -rf $RPM_BUILD_ROOT

%files
%defattr(0644,root,root,0755)
%doc ../SOURCES/LICENSE.txt
%doc %{_javadocdir}/%{name}-%{version}/*
%doc %{_javadocdir}/%{name}
%{_javadir}/%{name}-%{version}.jar
%{_javadir}/%{name}.jar
%defattr(0755,root,root,0755)
%{_bindir}/%{name}

%changelog
* Fri Jan 8 2010 Andrew Griffin <andrew@opengamma.com
- file created
