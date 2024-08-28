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

  -cleanupCycle:
    <XXXX> in ms. How often a proxy will check for timed out thread.

  -timeout:
    <XXXX>  the timeout in seconds before the hub automatically ends
      a test that hasn't had any activity in the last X seconds. The
      browser will be released for another test to use. This typically
      takes care of the client crashes.

  -browserTimeout:
    The timeout in seconds a browser can hang

  -hub:
    <http://localhost:4444/grid/register> : the url that will be used
      to post the registration request. This option takes precedence
      over -hubHost and -hubPort options.

  -hubHost:
    <IP | hostname> : the host address of a hub the registration
      request should be sent to. Default to localhost. Option -hub
      takes precedence over this option.

  -hubPort:
    <xxxx> : the port listened by a hub the registration request
      should be sent to. Default to 4444. Option -hub takes precedence
      over this option.

  -proxy:
    the class that will be used to represent the node. By default
      org.openqa.grid.selenium.proxy.DefaultRemoteProxy.

  -maxSession:
    max number of tests that can run at the same time on the node,
      independently of the browser used.

  -registerCycle:
    how often in ms the node will try to register itself again.Allow
      to restart the hub without having to restart the nodes.

  -nodePolling:
    in ms. Interval between alive checks of node how often the hub
      checks if the node is still alive.

  -unregisterIfStillDownAfter:
    in ms. If the node remains down for more than
      unregisterIfStillDownAfter millisec, it will disappear from the
      hub.Default is 1min.

  -downPollingLimit:
    node is marked as down after downPollingLimit alive checks.

  -nodeStatusCheckTimeout:
    in ms. Connection and socket timeout which is used for node alive
      check.