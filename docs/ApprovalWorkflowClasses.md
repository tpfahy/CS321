```mermaid
classDiagram
class GreenCardFormData {
    - name: string
    - dateOfBirth: Date
    - residenceSince: Date
    - a_number: string
    - ssn: string
    - address: string
    - sex: Enum

    + getters()
    + setters()
}

class ApprovalWorkflow {
    - currentFormData: GreenCardFormData
    - validationRules: any

    + updateFormData()
    + validate()
    + submit()
}

class Workflow {
    << abstract >>
    ~ currentWFObject: WorkflowObject
    + getWorkflowID()
    + countWorkflowObjects()
    + updateWorkflowObject()
    + getCurrentWorkflowObject()
    + getNextWorkflowObject()
}

class ApprovalWorkflowUI {
    - approvalWorkflow: ApprovalWorkflow
    + displayForm()
}

GreenCardFormData "1" --* "1" ApprovalWorkflow
ApprovalWorkflow  <|-- Workflow
ApprovalWorkflowUI "1" --> "1" ApprovalWorkflow
```
