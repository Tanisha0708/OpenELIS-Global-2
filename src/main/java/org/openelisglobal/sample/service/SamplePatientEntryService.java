SamplePatientRequestContext context = new SamplePatientRequestContext();
context.setUpdateData(updateData);
context.setPatientUpdate(patientUpdate);
context.setPatientInfo(patientInfo);
context.setForm(form);
context.setUsername(request.getUserPrincipal().getName());

samplePatientEntryService.persistData(context);
