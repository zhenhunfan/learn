// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: person.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
/// <summary>Holder for reflection information generated from person.proto</summary>
public static partial class PersonReflection {

  #region Descriptor
  /// <summary>File descriptor for person.proto</summary>
  public static pbr::FileDescriptor Descriptor {
    get { return descriptor; }
  }
  private static pbr::FileDescriptor descriptor;

  static PersonReflection() {
    byte[] descriptorData = global::System.Convert.FromBase64String(
        string.Concat(
          "CgxwZXJzb24ucHJvdG8iyAIKBlBlcnNvbhIKCgJpZBgBIAEoBRIMCgRuYW1l",
          "GAIgASgJEg8KB2lzX21hbGUYAyABKAgSDgoGaGVpZ2h0GAQgASgCEg4KBndl",
          "aWdodBgFIAEoAhIOCgZhdmF0b3IYBiABKAwSDQoFZW1haWwYByABKAkSFgoO",
          "ZW1haWxfdmVyaWZpZWQYCCABKAgSFAoMcGhvbmVfbnVtYmVyGAkgAygJEh4K",
          "BmdlbmRlchgVIAEoDjIOLlBlcnNvbi5HZW5kZXIiagoGR2VuZGVyEhEKDU5P",
          "VF9TUEVDSUZJRUQQABIKCgZGRU1BTEUQARIICgRNQUxFEAISCQoFV09NQU4Q",
          "ARIHCgNNQU4QAhoCEAEiBAgDEAMiBAgEEAQiCAgFEP////8HKgNCT1kqBEdJ",
          "UkxKBAgKEAtKBAgLEAxKBAgMEBVSA2Zvb1IDYmFyYgZwcm90bzM="));
    descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
        new pbr::FileDescriptor[] { },
        new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
          new pbr::GeneratedClrTypeInfo(typeof(global::Person), global::Person.Parser, new[]{ "Id", "Name", "IsMale", "Height", "Weight", "Avator", "Email", "EmailVerified", "PhoneNumber", "Gender" }, null, new[]{ typeof(global::Person.Types.Gender) }, null, null)
        }));
  }
  #endregion

}
#region Messages
public sealed partial class Person : pb::IMessage<Person> {
  private static readonly pb::MessageParser<Person> _parser = new pb::MessageParser<Person>(() => new Person());
  private pb::UnknownFieldSet _unknownFields;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<Person> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PersonReflection.Descriptor.MessageTypes[0]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Person() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Person(Person other) : this() {
    id_ = other.id_;
    name_ = other.name_;
    isMale_ = other.isMale_;
    height_ = other.height_;
    weight_ = other.weight_;
    avator_ = other.avator_;
    email_ = other.email_;
    emailVerified_ = other.emailVerified_;
    phoneNumber_ = other.phoneNumber_.Clone();
    gender_ = other.gender_;
    _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Person Clone() {
    return new Person(this);
  }

  /// <summary>Field number for the "id" field.</summary>
  public const int IdFieldNumber = 1;
  private int id_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int Id {
    get { return id_; }
    set {
      id_ = value;
    }
  }

  /// <summary>Field number for the "name" field.</summary>
  public const int NameFieldNumber = 2;
  private string name_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string Name {
    get { return name_; }
    set {
      name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "is_male" field.</summary>
  public const int IsMaleFieldNumber = 3;
  private bool isMale_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool IsMale {
    get { return isMale_; }
    set {
      isMale_ = value;
    }
  }

  /// <summary>Field number for the "height" field.</summary>
  public const int HeightFieldNumber = 4;
  private float height_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public float Height {
    get { return height_; }
    set {
      height_ = value;
    }
  }

  /// <summary>Field number for the "weight" field.</summary>
  public const int WeightFieldNumber = 5;
  private float weight_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public float Weight {
    get { return weight_; }
    set {
      weight_ = value;
    }
  }

  /// <summary>Field number for the "avator" field.</summary>
  public const int AvatorFieldNumber = 6;
  private pb::ByteString avator_ = pb::ByteString.Empty;
  /// <summary>
  ///头像
  /// </summary>
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public pb::ByteString Avator {
    get { return avator_; }
    set {
      avator_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "email" field.</summary>
  public const int EmailFieldNumber = 7;
  private string email_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string Email {
    get { return email_; }
    set {
      email_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "email_verified" field.</summary>
  public const int EmailVerifiedFieldNumber = 8;
  private bool emailVerified_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool EmailVerified {
    get { return emailVerified_; }
    set {
      emailVerified_ = value;
    }
  }

  /// <summary>Field number for the "phone_number" field.</summary>
  public const int PhoneNumberFieldNumber = 9;
  private static readonly pb::FieldCodec<string> _repeated_phoneNumber_codec
      = pb::FieldCodec.ForString(74);
  private readonly pbc::RepeatedField<string> phoneNumber_ = new pbc::RepeatedField<string>();
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public pbc::RepeatedField<string> PhoneNumber {
    get { return phoneNumber_; }
  }

  /// <summary>Field number for the "gender" field.</summary>
  public const int GenderFieldNumber = 21;
  private global::Person.Types.Gender gender_ = global::Person.Types.Gender.NotSpecified;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public global::Person.Types.Gender Gender {
    get { return gender_; }
    set {
      gender_ = value;
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as Person);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(Person other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (Id != other.Id) return false;
    if (Name != other.Name) return false;
    if (IsMale != other.IsMale) return false;
    if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(Height, other.Height)) return false;
    if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(Weight, other.Weight)) return false;
    if (Avator != other.Avator) return false;
    if (Email != other.Email) return false;
    if (EmailVerified != other.EmailVerified) return false;
    if(!phoneNumber_.Equals(other.phoneNumber_)) return false;
    if (Gender != other.Gender) return false;
    return Equals(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (Id != 0) hash ^= Id.GetHashCode();
    if (Name.Length != 0) hash ^= Name.GetHashCode();
    if (IsMale != false) hash ^= IsMale.GetHashCode();
    if (Height != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(Height);
    if (Weight != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(Weight);
    if (Avator.Length != 0) hash ^= Avator.GetHashCode();
    if (Email.Length != 0) hash ^= Email.GetHashCode();
    if (EmailVerified != false) hash ^= EmailVerified.GetHashCode();
    hash ^= phoneNumber_.GetHashCode();
    if (Gender != global::Person.Types.Gender.NotSpecified) hash ^= Gender.GetHashCode();
    if (_unknownFields != null) {
      hash ^= _unknownFields.GetHashCode();
    }
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    if (Id != 0) {
      output.WriteRawTag(8);
      output.WriteInt32(Id);
    }
    if (Name.Length != 0) {
      output.WriteRawTag(18);
      output.WriteString(Name);
    }
    if (IsMale != false) {
      output.WriteRawTag(24);
      output.WriteBool(IsMale);
    }
    if (Height != 0F) {
      output.WriteRawTag(37);
      output.WriteFloat(Height);
    }
    if (Weight != 0F) {
      output.WriteRawTag(45);
      output.WriteFloat(Weight);
    }
    if (Avator.Length != 0) {
      output.WriteRawTag(50);
      output.WriteBytes(Avator);
    }
    if (Email.Length != 0) {
      output.WriteRawTag(58);
      output.WriteString(Email);
    }
    if (EmailVerified != false) {
      output.WriteRawTag(64);
      output.WriteBool(EmailVerified);
    }
    phoneNumber_.WriteTo(output, _repeated_phoneNumber_codec);
    if (Gender != global::Person.Types.Gender.NotSpecified) {
      output.WriteRawTag(168, 1);
      output.WriteEnum((int) Gender);
    }
    if (_unknownFields != null) {
      _unknownFields.WriteTo(output);
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (Id != 0) {
      size += 1 + pb::CodedOutputStream.ComputeInt32Size(Id);
    }
    if (Name.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
    }
    if (IsMale != false) {
      size += 1 + 1;
    }
    if (Height != 0F) {
      size += 1 + 4;
    }
    if (Weight != 0F) {
      size += 1 + 4;
    }
    if (Avator.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeBytesSize(Avator);
    }
    if (Email.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(Email);
    }
    if (EmailVerified != false) {
      size += 1 + 1;
    }
    size += phoneNumber_.CalculateSize(_repeated_phoneNumber_codec);
    if (Gender != global::Person.Types.Gender.NotSpecified) {
      size += 2 + pb::CodedOutputStream.ComputeEnumSize((int) Gender);
    }
    if (_unknownFields != null) {
      size += _unknownFields.CalculateSize();
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(Person other) {
    if (other == null) {
      return;
    }
    if (other.Id != 0) {
      Id = other.Id;
    }
    if (other.Name.Length != 0) {
      Name = other.Name;
    }
    if (other.IsMale != false) {
      IsMale = other.IsMale;
    }
    if (other.Height != 0F) {
      Height = other.Height;
    }
    if (other.Weight != 0F) {
      Weight = other.Weight;
    }
    if (other.Avator.Length != 0) {
      Avator = other.Avator;
    }
    if (other.Email.Length != 0) {
      Email = other.Email;
    }
    if (other.EmailVerified != false) {
      EmailVerified = other.EmailVerified;
    }
    phoneNumber_.Add(other.phoneNumber_);
    if (other.Gender != global::Person.Types.Gender.NotSpecified) {
      Gender = other.Gender;
    }
    _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
          break;
        case 8: {
          Id = input.ReadInt32();
          break;
        }
        case 18: {
          Name = input.ReadString();
          break;
        }
        case 24: {
          IsMale = input.ReadBool();
          break;
        }
        case 37: {
          Height = input.ReadFloat();
          break;
        }
        case 45: {
          Weight = input.ReadFloat();
          break;
        }
        case 50: {
          Avator = input.ReadBytes();
          break;
        }
        case 58: {
          Email = input.ReadString();
          break;
        }
        case 64: {
          EmailVerified = input.ReadBool();
          break;
        }
        case 74: {
          phoneNumber_.AddEntriesFrom(input, _repeated_phoneNumber_codec);
          break;
        }
        case 168: {
          Gender = (global::Person.Types.Gender) input.ReadEnum();
          break;
        }
      }
    }
  }

  #region Nested types
  /// <summary>Container for nested types declared in the Person message type.</summary>
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static partial class Types {
    public enum Gender {
      [pbr::OriginalName("NOT_SPECIFIED")] NotSpecified = 0,
      [pbr::OriginalName("FEMALE")] Female = 1,
      [pbr::OriginalName("MALE")] Male = 2,
      [pbr::OriginalName("WOMAN", PreferredAlias = false)] Woman = 1,
      [pbr::OriginalName("MAN", PreferredAlias = false)] Man = 2,
    }

  }
  #endregion

}

#endregion


#endregion Designer generated code
