Role Name
=========

A brief description of the role goes here.

Requirements
------------

Any pre-requisites that may not be covered by Ansible itself or the role should be mentioned here. For instance, if the role uses the EC2 module, it may be a good idea to mention in this section that the boto package is required.

Role Variables
--------------

A description of the settable variables for this role should go here, including any variables that are in defaults/main.yml, vars/main.yml, and any variables that can/should be set via parameters to the role. Any variables that are read from other roles and/or the global scope (ie. hostvars, group vars, etc.) should be mentioned here as well.

Dependencies
------------

A list of other roles hosted on Galaxy should go here, plus any details in regards to parameters that may need to be set for other roles, or variables that are used from other roles.

Example Playbook
----------------

Including an example of how to use your role (for instance, with variables passed in as parameters) is always nice for users too:

    - hosts: servers
      roles:
         - { role: username.rolename, x: 42 }

License
-------

BSD

Author Information
------------------

An optional section for the role authors to include contact information, or a website (HTML is not allowed).

-host:
    <IP | hostname> : usually not needed and determined
      automatically. For exotic network configuration, network with
      VPN, specifying the host might be necessary.

  -port:
    <xxxx> : the port the remote/hub will listen on. Default to 4444.

  -throwOnCapabilityNotPresent:
    <true | false> default to true. If true, the hub will reject test
      requests right away if no proxy is currently registered that can
      host that capability.Set it to false to have the request queued
      until a node supporting the capability is added to the grid.

  -newSessionWaitTimeout:
    <XXXX>. Default to no timeout ( -1 ) the time in ms after which a
      new test waiting for a node to become available will time
      out.When that happens, the test will throw an exception before
      starting a browser.

  -capabilityMatcher:
    a class implementing the CapabilityMatcher interface. Defaults to
      org.openqa.grid.internal.utils.DefaultCapabilityMatcher. Specify
      the logic the hub will follow to define if a request can be
      assigned to a node.Change this class if you want to have the
      matching process use regular expression instead of exact match
      for the version of the browser for instance. All the nodes of a
      grid instance will use the same matcher, defined by the registry.

  -prioritizer:
    a class implementing the Prioritizer interface. Default to null (
      no priority = FIFO ).Specify a custom prioritizer if you need the
      grid to process the tests from the CI, or the IE tests first for
      instance.

  -servlets:
    <com.mycompany.MyServlet,com.mycompany.MyServlet2> to register a
      new servlet on the hub/node. The servlet will accessible under
      the path  /grid/admin/MyServlet /grid/admin/MyServlet2

  -grid1Yml:
    a YML file following grid1 format.

  -hubConfig:
    a JSON file following grid2 format that defines the hub
      properties.

  -browserTimeout:
    The timeout in seconds a browser can hang