
package labmaintenanceformmain;

public class LabMaintenanceForm {
    private int id;
    private String reporter;
    private String problem_type;
    private String processed_by;

    public LabMaintenanceForm(int id, String reporter, String problem_type, String processed_by) {
        this.id = id;
        this.reporter = reporter;
        this.problem_type = problem_type;
        this.processed_by = processed_by;
    }

    public String getProblem_type() {
        return problem_type;
    }

    @Override
    public String toString() {
        return "\nLabMaintenanceForm" + "\nId=" + id + "\nReporter=" + reporter + "\nProblem_type=" + problem_type + "\nProcessed_by=" + processed_by;
    }
       
}
