package com.ivoyant.main.filehandling.Serializable_Desrializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Externalizable;
import java.io.*;

@AllArgsConstructor
@NoArgsConstructor
public class EmployeExternalizable implements Externalizable {


        String name;
        int age;

        // Manually serialize only necessary fields
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeUTF(name);  // UTF making the file smaller and faster to process.
            out.writeInt(age);   // Writing int separately
        }

        // Manually deserialize only necessary fields
        @Override
        public void readExternal(ObjectInput in) throws IOException {
            name = in.readUTF();
            age = in.readInt();
        }
    }


