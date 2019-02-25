package evotingsystem

class PermissionMap {

    static constraints = {
    }

    Map <String, Set<Permission>> permissionsMap // should be Map<UI, SetOfPermissions>
    Map <String, Set<Permission>> defaultPermissionsMap // should be Map<UI, SetOfPermissions>

}
